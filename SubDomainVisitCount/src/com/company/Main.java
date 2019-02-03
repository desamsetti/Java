package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] inputArray = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> outputArray = subdomainVisits(inputArray);
        for(String s:outputArray)
        {
            System.out.print(s+ " ");
        }
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> res = new ArrayList<String>();

        for(String cpd:cpdomains)
        {
            int idxspace = cpd.indexOf(" ");
            int count = Integer.valueOf(cpd.substring(0,idxspace));
            String domainString = cpd.substring(idxspace+1);
            do {
                if (!map.containsKey(domainString)) {
                    map.put(domainString, count);
                } else {
                    map.put(domainString, map.get(domainString) + count);
                }
                int nextIdx = domainString.indexOf('.');
                if (nextIdx != -1) {
                    domainString = domainString.substring(nextIdx + 1);
                } else {
                    domainString = null;
                }
            }while(domainString!=null);
        }

        for(String domain:map.keySet())
        {
            String resString = ""+map.get(domain)+" "+domain;
            res.add(resString);
        }
        return res;
    }
}
