
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.*;
import javax.sql.rowset.*;

public class SimpleCacheResponse extends ResponseCache{

//     @Override
//     public CacheResponse get(URI uri, String rqstMethod, Map<String, List<String>> rqstHeaders) throws IOException {
//        SimpleResponseCache cacheResponse=CachedRowSet.get(uri);
//        if(cacheResponse!=null){
//           // cacheRes
//        }

public CacheRequest put(URI uri, URLConnection conn) throws IOException {
    return new SimpleCacheRequest(uri,con);
}
public class SimpleResponseCache extends CacheResponse{
private final Map<String,List<String>> header;
private final byte[] body;
private boolean fromCache;
        @Override
        public Map<String, List<String>> getHeaders() throws IOException {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public InputStream getBody() throws IOException {
            throw new UnsupportedOperationException("Not supported yet.");
        }
 
}
    @Override
}
