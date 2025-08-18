package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* loaded from: classes2.dex */
public final /* synthetic */ class dd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        lx5 lx5Var = (lx5) this.b;
        synchronized (lx5Var.o) {
            try {
                if (lx5Var.s0 == null) {
                    return;
                }
                try {
                    vx5 vx5VarD = lx5Var.d();
                    int i = vx5VarD.e;
                    if (i == 2) {
                        synchronized (lx5Var.o) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        dp3 dp3Var = lx5Var.c;
                        Context context = lx5Var.a;
                        dp3Var.getClass();
                        Typeface typefaceA = a4f.a(context, new vx5[]{vx5VarD}, 0);
                        MappedByteBuffer mappedByteBufferP = f8.p(lx5Var.a, vx5VarD.a);
                        if (mappedByteBufferP == null || typefaceA == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            ByteBuffer byteBufferDuplicate = mappedByteBufferP.duplicate();
                            byteBufferDuplicate.position((int) oag.l(new wd6(byteBufferDuplicate)).b);
                            m99 m99Var = new m99();
                            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                            int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                            m99Var.o = byteBufferDuplicate;
                            m99Var.a = iPosition;
                            int i2 = iPosition - byteBufferDuplicate.getInt(iPosition);
                            m99Var.b = i2;
                            m99Var.c = ((ByteBuffer) m99Var.o).getShort(i2);
                            t99 t99Var = new t99(typefaceA, m99Var);
                            Trace.endSection();
                            synchronized (lx5Var.o) {
                                try {
                                    tu0 tu0Var = lx5Var.s0;
                                    if (tu0Var != null) {
                                        tu0Var.y(t99Var);
                                    }
                                } finally {
                                }
                            }
                            lx5Var.b();
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (lx5Var.o) {
                        try {
                            tu0 tu0Var2 = lx5Var.s0;
                            if (tu0Var2 != null) {
                                tu0Var2.v(th2);
                            }
                            lx5Var.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5 A[Catch: all -> 0x0168, InterruptedException -> 0x01cd, TRY_LEAVE, TryCatch #7 {all -> 0x0168, blocks: (B:54:0x0140, B:59:0x014d, B:61:0x0157, B:63:0x0163, B:72:0x0176, B:73:0x017b, B:92:0x01c7, B:94:0x01d0, B:97:0x01e5, B:100:0x01f5, B:102:0x01f9, B:106:0x020e, B:114:0x023f, B:117:0x0259, B:118:0x0262, B:121:0x026f, B:148:0x02d0, B:127:0x0286, B:130:0x0292, B:132:0x0299, B:135:0x02a9, B:145:0x02c6, B:146:0x02cc, B:147:0x02cf), top: B:246:0x0140 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd4.run():void");
    }
}
