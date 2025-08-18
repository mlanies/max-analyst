package org.apache.http.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes2.dex */
public class EntityTemplate extends AbstractHttpEntity {
    private final ContentProducer contentproducer;

    public EntityTemplate(ContentProducer contentProducer) {
        if (contentProducer == null) {
            throw new IllegalArgumentException("Content producer may not be null");
        }
        this.contentproducer = contentProducer;
    }

    @Override // org.apache.http.entity.AbstractHttpEntity, org.apache.http.HttpEntity
    public void consumeContent() throws IOException {
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw new UnsupportedOperationException("Entity template does not implement getContent()");
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return -1L;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        this.contentproducer.writeTo(outputStream);
    }
}
