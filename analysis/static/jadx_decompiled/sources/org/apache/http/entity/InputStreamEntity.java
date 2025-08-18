package org.apache.http.entity;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes2.dex */
public class InputStreamEntity extends AbstractHttpEntity {
    private static final int BUFFER_SIZE = 2048;
    private boolean consumed = false;
    private final InputStream content;
    private final long length;

    public InputStreamEntity(InputStream inputStream, long j) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Source input stream may not be null");
        }
        this.content = inputStream;
        this.length = j;
    }

    @Override // org.apache.http.entity.AbstractHttpEntity, org.apache.http.HttpEntity
    public void consumeContent() throws IOException {
        this.consumed = true;
        this.content.close();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException {
        return this.content;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.length;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return !this.consumed;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        int i;
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream inputStream = this.content;
        byte[] bArr = new byte[BUFFER_SIZE];
        long j = this.length;
        if (j < 0) {
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            }
        } else {
            while (j > 0 && (i = inputStream.read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, j))) != -1) {
                outputStream.write(bArr, 0, i);
                j -= i;
            }
        }
        this.consumed = true;
    }
}
