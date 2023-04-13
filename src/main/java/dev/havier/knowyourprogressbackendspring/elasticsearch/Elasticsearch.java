package dev.havier.knowyourprogressbackendspring.elasticsearch;


import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import dev.havier.knowyourprogressbackendspring.entity.WordsReadingRecords;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;

import java.io.IOException;

public class Elasticsearch {

    public static void main(String[] args) throws IOException {

        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();

        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("elastic", "changeme"));

        RestClient restClient = RestClient
                .builder(new HttpHost("localhost", 9200))
                .setHttpClientConfigCallback(
                        httpAsyncClientBuilder ->
                                httpAsyncClientBuilder
                                        .setDefaultCredentialsProvider(credentialsProvider)
                ).build();


        ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());

        ElasticsearchClient esClient = new ElasticsearchClient(transport);


        var record = new WordsReadingRecords();
        record.setId(1234567);
        record.setWord("testword");
        record.setYear("2020");
        record.setMonth("12");
        record.setDay("11");

        IndexRequest.Builder<WordsReadingRecords> indexReqBuilder = new IndexRequest.Builder<>();

        indexReqBuilder.index("record");
        indexReqBuilder.id(record.getId().toString());
        indexReqBuilder.document(record);


        IndexResponse response = esClient.index(indexReqBuilder.build());

        System.out.println("indexed with version" + response.version());


    }

}
