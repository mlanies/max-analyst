package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: classes2.dex */
public class LoggingSessionInputBuffer implements SessionInputBuffer {
    private final SessionInputBuffer in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire) {
        this.in = sessionInputBuffer;
        this.wire = wire;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.in.getMetrics();
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws IOException {
        return this.in.isDataAvailable(i);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (this.wire.enabled() && i3 > 0) {
            this.wire.input(bArr, i, i3);
        }
        return i3;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public String readLine() throws IOException {
        String line = this.in.readLine();
        if (this.wire.enabled() && line != null) {
            this.wire.input(line.concat("[EOL]"));
        }
        return line;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read() throws IOException {
        int i = this.in.read();
        if (this.wire.enabled() && i > 0) {
            this.wire.input(i);
        }
        return i;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        int line = this.in.readLine(charArrayBuffer);
        if (this.wire.enabled() && line > 0) {
            this.wire.input(new String(charArrayBuffer.buffer(), charArrayBuffer.length() - line, line).concat("[EOL]"));
        }
        return line;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr) throws IOException {
        int i = this.in.read(bArr);
        if (this.wire.enabled() && i > 0) {
            this.wire.input(bArr, 0, i);
        }
        return i;
    }
}
