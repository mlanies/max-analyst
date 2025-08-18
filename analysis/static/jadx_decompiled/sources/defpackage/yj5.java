package defpackage;

import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.UnexpectedResponseBodyException;

/* loaded from: classes2.dex */
public final class yj5 {
    public final int a;
    public final String b;
    public final w0f c;
    public final String d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final URI h;
    public final File i;
    public final long j;
    public final pad k;
    public final aj9 l;
    public final khe m;
    public final aj9 n;
    public final khe o;
    public final y77 p;
    public final ContextScope q;
    public long r;
    public String s;
    public final n8f t;
    public final boolean u;

    public yj5(String str, String str2, kke kkeVar, khe kheVar, je7 je7Var, je7 je7Var2, je7 je7Var3, int i, String str3, w0f w0fVar) throws HttpErrorException {
        String strConcat;
        String str4;
        this.a = i;
        this.b = str3;
        this.c = w0fVar;
        String name = yj5.class.getName();
        this.d = name;
        this.e = kheVar;
        this.f = je7Var3;
        this.g = je7Var2;
        this.h = new URI(str);
        File file = new File(str2);
        this.i = file;
        long length = file.length();
        this.j = length;
        pad padVar = new pad();
        padVar.f = w0fVar.b();
        int iS = au1.s(i);
        if (iS == 0) {
            strConcat = "HTTP_UPLOAD_IMAGE";
        } else if (iS == 1) {
            strConcat = "HTTP_UPLOAD_AUDIO";
        } else if (iS == 2) {
            strConcat = "HTTP_UPLOAD_VIDEO";
        } else if (iS != 3) {
            if (i == 1) {
                str4 = "PHOTO";
            } else if (i == 2) {
                str4 = "AUDIO";
            } else if (i == 3) {
                str4 = "VIDEO";
            } else if (i == 4) {
                str4 = "FILE";
            } else {
                if (i != 5) {
                    throw null;
                }
                str4 = "STICKER";
            }
            strConcat = "HTTP_UPLOAD_".concat(str4);
        } else {
            strConcat = "HTTP_UPLOAD_FILE";
        }
        padVar.a = strConcat;
        this.k = padVar;
        this.l = bj9.a();
        this.m = new khe(new oj5(this, 0));
        this.n = bj9.a();
        this.o = new khe(new z30(12, je7Var2));
        this.p = pag.a();
        this.q = j1e.a((nx3) ((w9a) kkeVar).d.getValue());
        this.t = new n8f(je7Var, w0fVar, length, i);
        this.u = true;
        if (!file.exists()) {
            hm9.p(name, "File by path not found=".concat(str2), null);
            throw new HttpErrorException("File not found", null, null, 6);
        }
        if (length == 0) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.s0, name, "Upload failed: trying to upload file with zero length", null);
            }
            throw new HttpErrorException("File is zero length", null, null, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v3, types: [a66] */
    /* JADX WARN: Type inference failed for: r8v8, types: [a66] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.yj5 r8, defpackage.wve r9, defpackage.w6f r10, java.nio.channels.AsynchronousFileChannel r11, defpackage.qj5 r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj5.a(yj5, wve, w6f, java.nio.channels.AsynchronousFileChannel, qj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String b(String str) {
        Object njcVar;
        int i;
        int i2;
        try {
            int length = str.length();
            int i3 = 0;
            while (true) {
                i2 = -1;
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (str.charAt(i3) == '{') {
                    break;
                }
                i3++;
            }
            int length2 = str.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i4 = length2 - 1;
                    if (str.charAt(length2) == '}') {
                        i2 = length2;
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    length2 = i4;
                }
            }
            njcVar = str.substring(i3, i2 + 1);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        String str2 = (String) njcVar;
        if (str2 == null && ((i = this.a) == 1 || i == 5)) {
            this.c.e(new UnexpectedResponseBodyException("Not found token in response", str));
        }
        return str2;
    }

    public final void c(w6f w6fVar, long j, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        long j4 = (j + j2) - 1;
        StringBuilder sbK = au1.k(j, "Content-Range: bytes ", "-");
        sbK.append(j4);
        sbK.append("/");
        sbK.append(j3);
        sbK.append("\n");
        sb.append(sbK.toString());
        sb.append("Content-Length: " + j2 + "\n");
        sb.append('\n');
        String string = sb.toString();
        if (this.u) {
            String str = this.d;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, w6fVar + ": remained headers " + string, null);
            }
        }
        ((ByteBuffer) this.o.getValue()).clear();
        ((ByteBuffer) this.o.getValue()).put(string.getBytes(a52.a));
        ((ByteBuffer) this.o.getValue()).flip();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.wve r11, defpackage.w6f r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj5.d(wve, w6f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0172 -> B:48:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x018e -> B:15:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.wve r20, defpackage.w6f r21, java.nio.channels.AsynchronousFileChannel r22, defpackage.a66 r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj5.e(wve, w6f, java.nio.channels.AsynchronousFileChannel, a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v15, types: [xi9] */
    /* JADX WARN: Type inference failed for: r0v19, types: [xi9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.wve r19, defpackage.w6f r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj5.f(wve, w6f, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
