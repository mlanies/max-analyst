package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class bo0 extends mw7 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo0(int i, int i2) {
        super(i);
        this.g = i2;
    }

    @Override // defpackage.mw7
    public Object a(Object obj) {
        switch (this.g) {
            case 3:
                qwd qwdVar = (qwd) obj;
                return qjd.b(qwdVar.a, qwdVar.b);
            default:
                return super.a(obj);
        }
    }

    @Override // defpackage.mw7
    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 1:
                ((Bitmap) obj2).recycle();
                break;
        }
    }

    @Override // defpackage.mw7
    public int h(Object obj) {
        switch (this.g) {
            case 0:
                int iD = qo0.d((Bitmap) obj);
                if (iD < 1) {
                    return 1;
                }
                return iD;
            default:
                return super.h(obj);
        }
    }
}
