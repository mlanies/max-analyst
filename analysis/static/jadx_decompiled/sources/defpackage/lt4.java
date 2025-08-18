package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.List;

/* loaded from: classes.dex */
public final class lt4 extends fqd {
    public final /* synthetic */ int x0;
    public final Object y0;

    public lt4(List list) {
        this.x0 = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        int i2 = (bArr[3] & 255) | ((bArr[2] & 255) << 8);
        fc3 fc3Var = new fc3();
        Paint paint = new Paint();
        fc3Var.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        fc3Var.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        fc3Var.c = new Canvas();
        fc3Var.o = new ot4(719, 575, 0, 719, 0, 575);
        fc3Var.X = new mt4(0, new int[]{0, -1, -16777216, -8421505}, fc3.j(), fc3.k());
        fc3Var.Y = new yt4(i, i2, 0);
        this.y0 = fc3Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 rxd, still in use, count: 2, list:
          (r0v2 rxd) from 0x0328: PHI (r0v3 rxd) = (r0v2 rxd), (r0v15 rxd) binds: [B:115:0x0322, B:157:0x0458] A[DONT_GENERATE, DONT_INLINE]
          (r0v2 rxd) from 0x02e2: MOVE (r49v5 rxd) = (r0v2 rxd)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // defpackage.fqd
    public final defpackage.abe a(int r47, byte[] r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt4.a(int, byte[], boolean):abe");
    }

    public lt4() {
        this.x0 = 1;
        this.y0 = new yaf(3, false);
    }
}
