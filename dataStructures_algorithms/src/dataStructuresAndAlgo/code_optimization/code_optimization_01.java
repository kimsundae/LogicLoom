package dataStructuresAndAlgo.code_optimization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 483p
* */
public class code_optimization_01 {
    // 최적화 전 O(N * M)
    public List<Map<String, Object>> connectBooksWithAuthors( List<HashMap<String, Object>> books, List<HashMap<String, Object>> authors ){

        List<Map<String, Object>> booksWithAuthors = new ArrayList<>();

        books.forEach( book -> {

            authors.forEach( author -> {
                if( ((int) book.get("author_id")) == (int) author.get("author_id")){
                    booksWithAuthors.add( new HashMap<String, Object>(){{
                        put("title", book.get("title"));
                        put("author", book.get("name"));
                    }});
                }
            });
        });
        return booksWithAuthors;
    }
    // 최적화 후 O(N)
    public List<Map<String, Object>> connectBooksWithAuthors2( List<HashMap<String, Object>> books, List<HashMap<String, Object>> authors ){
        List<Map<String, Object>> booksWithAuthors = new ArrayList<>();
        Map<Integer, String> authorHashMap = new HashMap<>();
        // 저자 데이터를 저자 해시 테이블로 변환한다.
        authors.forEach( author -> {
            authorHashMap.put((Integer)author.get("author_id"), (String)author.get("name"));
        });

        books.forEach( book -> {
            booksWithAuthors.add(
                    new HashMap<String, Object>(){{
                        put("title", book.get("title"));
                        put("author", authorHashMap.get(book.get("author_id")));
                    }});
        });
        return booksWithAuthors;
    }
}
