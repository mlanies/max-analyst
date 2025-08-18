package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ns7 {
    public final long a;
    public final byte[] b;
    public final int c;

    public ns7(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
        this.c = bArr.length + 30;
    }

    public final void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(35);
        tpa.b(outputStream, String.valueOf(i));
        outputStream.write(32);
        tpa.b(outputStream, String.valueOf(this.a));
        tpa.b(outputStream, " | ");
        outputStream.write(this.b);
        outputStream.write(10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ns7) {
            ns7 ns7Var = (ns7) obj;
            if (this.a == ns7Var.a && Arrays.equals(this.b, ns7Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) | Long.hashCode(this.a);
    }

    public final String toString() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, 0);
        return byteArrayOutputStream.toString();
    }
}
