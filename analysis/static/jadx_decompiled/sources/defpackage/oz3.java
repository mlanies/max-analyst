package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class oz3 extends uf4 {
    public final int l;
    public Rect m;
    public final RectF n;
    public boolean o;
    public float p;

    public oz3(b9b b9bVar, int i) {
        super(b9bVar);
        this.n = new RectF();
        this.p = 0.0f;
        this.l = i;
    }

    @Override // defpackage.uf4, defpackage.jag
    public final void a(float f, float f2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019 A[PHI: r2 r4
      0x0019: PHI (r2v8 float) = (r2v1 float), (r2v2 float) binds: [B:5:0x0017, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0019: PHI (r4v4 int) = (r4v0 int), (r4v1 int) binds: [B:5:0x0017, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.uf4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r8 = this;
            android.graphics.Rect r0 = r8.m
            if (r0 == 0) goto L51
            android.graphics.Matrix r0 = r8.k
            android.graphics.RectF r1 = r8.n
            android.graphics.RectF r2 = r8.h
            r0.mapRect(r1, r2)
            float r2 = r1.top
            android.graphics.Rect r3 = r8.m
            int r4 = r3.top
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r6 = 0
            if (r5 <= 0) goto L1c
        L19:
            float r4 = (float) r4
            float r4 = r4 - r2
            goto L27
        L1c:
            float r2 = r1.bottom
            int r4 = r3.bottom
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L26
            goto L19
        L26:
            r4 = r6
        L27:
            float r2 = r1.left
            int r5 = r3.left
            float r7 = (float) r5
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L33
            float r1 = (float) r5
            float r1 = r1 - r2
            goto L41
        L33:
            float r1 = r1.right
            int r2 = r3.right
            float r3 = (float) r2
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L40
            float r2 = (float) r2
            float r1 = r2 - r1
            goto L41
        L40:
            r1 = r6
        L41:
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 != 0) goto L49
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L51
        L49:
            r0.postTranslate(r1, r4)
            b9b r8 = r8.a
            r8.q()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz3.b():void");
    }

    public final Rect c(int i) {
        RectF rectF = new RectF();
        this.k.mapRect(rectF, this.h);
        if (this.m == null) {
            return null;
        }
        float fWidth = i / rectF.width();
        int i2 = this.m.left;
        float f = rectF.left;
        int i3 = (int) ((i2 - f) * fWidth);
        int i4 = (int) ((r2.top - rectF.top) * fWidth);
        int iWidth = (int) (((i2 - f) + r2.width()) * fWidth);
        Rect rect = this.m;
        Rect rect2 = new Rect(i3, i4, iWidth, (int) (((rect.top - rectF.top) + rect.height()) * fWidth));
        if (this.o && rect2.height() != rect2.width()) {
            hm9.k("oz3", "cropped rect is not square: square it");
            if (rect2.width() > rect2.height()) {
                rect2.right -= rect2.width() - rect2.height();
            } else {
                rect2.bottom -= rect2.height() - rect2.width();
            }
        }
        return rect2;
    }

    public final void d(int i) {
        float fWidth = (c(i).width() / this.l) - 0.05f;
        if (fWidth > 1.0f) {
            this.f = fWidth;
        }
    }

    public final void e() {
        RectF rectF = this.h;
        if (rectF == null || this.m == null) {
            return;
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        this.e = Math.max(this.m.width() / fWidth, this.m.height() / fHeight);
        b();
    }

    @Override // defpackage.uf4, defpackage.jag
    public final void reset() {
        super.reset();
        this.p = 0.0f;
    }
}
