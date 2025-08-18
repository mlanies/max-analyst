package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* loaded from: classes2.dex */
public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {
    private EofSensorWatcher eofWatcher;
    private boolean selfClosed;
    protected InputStream wrappedStream;

    public EofSensorInputStream(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Wrapped stream may not be null.");
        }
        this.wrappedStream = inputStream;
        this.selfClosed = false;
        this.eofWatcher = eofSensorWatcher;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() throws IOException {
        this.selfClosed = true;
        checkAbort();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!isReadAllowed()) {
            return 0;
        }
        try {
            return this.wrappedStream.available();
        } catch (IOException e) {
            this.checkAbort();
            throw e;
        }
    }

    public void checkAbort() throws IOException {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null ? eofSensorWatcher.streamAbort(inputStream) : true) {
                    this.wrappedStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th) {
                this.wrappedStream = null;
                throw th;
            }
        }
    }

    public void checkClose() throws IOException {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null ? eofSensorWatcher.streamClosed(inputStream) : true) {
                    this.wrappedStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th) {
                this.wrappedStream = null;
                throw th;
            }
        }
    }

    public void checkEOF(int i) throws IOException {
        InputStream inputStream = this.wrappedStream;
        if (inputStream == null || i >= 0) {
            return;
        }
        try {
            EofSensorWatcher eofSensorWatcher = this.eofWatcher;
            if (eofSensorWatcher != null ? eofSensorWatcher.eofDetected(inputStream) : true) {
                this.wrappedStream.close();
            }
            this.wrappedStream = null;
        } catch (Throwable th) {
            this.wrappedStream = null;
            throw th;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.selfClosed = true;
        checkClose();
    }

    public boolean isReadAllowed() throws IOException {
        if (this.selfClosed) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.wrappedStream != null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int i = this.wrappedStream.read();
            checkEOF(i);
            return i;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() throws IOException {
        close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int i3 = this.wrappedStream.read(bArr, i, i2);
            checkEOF(i3);
            return i3;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int i = this.wrappedStream.read(bArr);
            checkEOF(i);
            return i;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }
}
