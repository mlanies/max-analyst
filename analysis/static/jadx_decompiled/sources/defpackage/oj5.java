package defpackage;

import android.net.Uri;
import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class oj5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj5 b;

    public /* synthetic */ oj5(yj5 yj5Var, int i) {
        this.a = i;
        this.b = yj5Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yj5 yj5Var = this.b;
                URI uri = yj5Var.h;
                String str = yj5Var.a == 1 ? "application/octet-stream" : "application/x-binary; charset=x-user-defined";
                StringBuilder sb = new StringBuilder("POST ");
                sb.append(uri.getRawPath());
                sb.append('?');
                sb.append(uri.getRawQuery());
                sb.append(" HTTP/1.1\nHost: ");
                sb.append(uri.getHost());
                sb.append("\nContent-Type: ");
                sb.append(str);
                sb.append('\n');
                File file = yj5Var.i;
                String str2 = yj5Var.b;
                sb.append("Content-Disposition: attachment; filename=" + (yj5Var.a == 5 ? (str2 == null || str2.length() == 0) ? file.getName() : Uri.encode(str2) : (str2 == null || str2.length() == 0) ? String.valueOf(file.getName().hashCode()) : Uri.encode(str2)) + "\n");
                sb.append("X-Uploading-Mode: parallel\nConnection: keep-alive\nUser-Agent: ");
                String strM = rh4.m(sb, (String) yj5Var.c.e.getValue(), '\n');
                if (yj5Var.u) {
                    String str3 = yj5Var.d;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, str3, "Prepared sharedHeaders: ".concat(strM), null);
                    }
                }
                byte[] bytes = strM.getBytes(a52.a);
                ByteBuffer byteBufferPut = ((ct0) yj5Var.g.getValue()).a(bytes.length).put(bytes);
                byteBufferPut.flip();
                return byteBufferPut;
            default:
                yj5 yj5Var2 = this.b;
                return AsynchronousFileChannel.open(Paths.get(yj5Var2.i.getPath(), new String[0]), Collections.singleton(StandardOpenOption.READ), (ExecutorService) yj5Var2.e.getValue(), new FileAttribute[0]);
        }
    }
}
