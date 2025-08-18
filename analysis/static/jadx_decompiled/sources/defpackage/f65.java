package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f65 extends FilterOutputStream {
    public static final byte[] Z = "Exif\u0000\u0000".getBytes(q55.d);
    public int X;
    public int Y;
    public final u55 a;
    public final byte[] b;
    public final ByteBuffer c;
    public int o;

    public f65(ByteArrayOutputStream byteArrayOutputStream, u55 u55Var) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.o = 0;
        this.a = u55Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x036d, code lost:
    
        if (r6 <= 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x036f, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0374, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f65.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
