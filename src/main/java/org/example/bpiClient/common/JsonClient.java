package org.example.bpiClient.common;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * JsonClient offers an abstraction to retriever JSON document and java serialization a using GET request.
 *
 * @param <T> class of the Java object the JSON represents.
 */
public abstract class JsonClient<T> {

    private final Gson gson;

    protected JsonClient() {
        gson = new Gson();
    }

    /**
     * Gets APi specific endpoint url.
     * @return url as a String.
     */
    protected abstract String getFullUrl();

    /**
     * Gets the response from the provided url as a json object
     *
     * @return instance of a java object the JSON represents
     * @throws IOException if error occurs while invoking the API.
     */
    @SuppressWarnings("unchecked")
    public T invoke() throws IOException {
        if ((this.getClass().getGenericSuperclass() instanceof ParameterizedType)) {
            Type[] typeArguments = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments();
            return gson.fromJson(IOUtils.toString(new URL(getFullUrl()), StandardCharsets.UTF_8),
                    (Class<T>) typeArguments[0]);
        }
        throw new IllegalStateException("return datatype not defined!");
    }
}
