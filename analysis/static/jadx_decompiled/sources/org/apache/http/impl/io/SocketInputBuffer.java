package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes2.dex */
public class SocketInputBuffer extends AbstractSessionInputBuffer {
    private final Socket socket;

    public SocketInputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        this.socket = socket;
        init(socket.getInputStream(), 8192, httpParams);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws IOException {
        boolean zHasBufferedData = hasBufferedData();
        if (!zHasBufferedData) {
            int soTimeout = this.socket.getSoTimeout();
            try {
                try {
                    this.socket.setSoTimeout(i);
                    fillBuffer();
                    zHasBufferedData = hasBufferedData();
                } catch (InterruptedIOException e) {
                    if (!(e instanceof SocketTimeoutException)) {
                        throw e;
                    }
                }
            } finally {
                this.socket.setSoTimeout(soTimeout);
            }
        }
        return zHasBufferedData;
    }

    public boolean isStale() throws IOException {
        boolean z = false;
        if (hasBufferedData()) {
            return false;
        }
        int soTimeout = this.socket.getSoTimeout();
        try {
            this.socket.setSoTimeout(1);
            if (fillBuffer() == -1) {
                z = true;
            }
        } catch (SocketTimeoutException unused) {
        } catch (IOException unused2) {
            this.socket.setSoTimeout(soTimeout);
            return true;
        } catch (Throwable th) {
            this.socket.setSoTimeout(soTimeout);
            throw th;
        }
        this.socket.setSoTimeout(soTimeout);
        return z;
    }
}
