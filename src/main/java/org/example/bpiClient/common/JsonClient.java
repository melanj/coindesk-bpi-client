package org.example.bpiClient.common;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public abstract class JsonClient<T> {

    private final Gson gson;

    protected JsonClient() {
        gson = new Gson();
    }

    protected abstract String getFullUrl();

    @SuppressWarnings("unchecked")
    public T invoke() throws IOException {
        if((this.getClass().getGenericSuperclass() instanceof ParameterizedType)){
            Type[] typeArguments = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments();
            return gson.fromJson(IOUtils.toString(new URL(getFullUrl()), StandardCharsets.UTF_8),
                    (Class<T>) typeArguments[0]);
        }
        throw new IllegalStateException("return datatype not defined!");
    }
}
