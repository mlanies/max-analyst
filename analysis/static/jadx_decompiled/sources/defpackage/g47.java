package defpackage;

import android.net.TrafficStats;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class g47 {
    public static final khe c = new khe(new fh5(23));
    public final zwd a;
    public final String b = g47.class.getName();

    public g47(zwd zwdVar) {
        this.a = zwdVar;
    }

    public final void a(Socket socket) throws IOException {
        String str = this.b;
        try {
            TrafficStats.untagSocket(socket);
        } catch (Exception e) {
            hm9.p(str, "error occuried while untag stat for " + socket, e);
        }
        if (socket.isClosed()) {
            return;
        }
        try {
            socket.close();
        } catch (IOException e2) {
            hm9.p(str, "failed to close " + socket, e2);
        }
    }

    public final void b(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        String str = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.o, str, "sendRequest, OPTIONS /generate_204 HTTP/1.1\r\nHost: gstatic.com:443\r\nUser-Agent: WebClient\r\nAccept: */*\r\nConnection: close\r\n\r\n ...", null);
        }
        Charset charset = a52.a;
        outputStream.write("OPTIONS /generate_204 HTTP/1.1\r\nHost: gstatic.com:443\r\nUser-Agent: WebClient\r\nAccept: */*\r\nConnection: close\r\n\r\n".getBytes(charset));
        outputStream.flush();
        byte[] bytes = "\r\n\r\n".getBytes(charset);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        do {
            int i3 = inputStream.read();
            if (i3 == -1) {
                throw new IOException("Unexpected error in header");
            }
            byteArrayOutputStream.write(i3);
            i2 = i3 == bytes[i2] ? i2 + 1 : 0;
        } while (i2 != bytes.length);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = (byte[]) c.getValue();
        int length = byteArray.length - bArr.length;
        if (length < 0) {
            i = -1;
            break;
        }
        while (!Arrays.equals(bArr, ys.Z(i, byteArray, bArr.length + i))) {
            if (i == length) {
                i = -1;
                break;
            }
            i++;
        }
        if (i == -1) {
            String str2 = new String(byteArray, a52.a);
            if (!eae.o0(str2, "HTTP/1.1 204 No Content", true)) {
                throw new IOException("Invalid reply header=".concat(str2));
            }
        }
        String str3 = this.b;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.o, str3, "process, looks like the gstatic.com is reachable", null);
        }
    }
}
