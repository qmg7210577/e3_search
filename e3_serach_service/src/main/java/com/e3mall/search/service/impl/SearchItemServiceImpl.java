package com.e3mall.search.service.impl;

import com.e3mall.search.service.SearchItemService;
import com.e3mall.utils.E3Result;
import org.apache.solr.client.solrj.SolrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qimenggao on 2017/12/26.
 */
@Service
public class SearchItemServiceImpl implements SearchItemService {
    @Autowired
    private SolrServer solrServer;

    @Override
    public E3Result importAllItemsToSolr() {
//        SolrServer solrServer = new HttpSolrServer("http://192.168.25.154:8080/solr");


        return null;
    }
}
