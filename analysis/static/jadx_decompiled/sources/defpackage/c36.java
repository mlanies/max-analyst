package defpackage;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public final /* synthetic */ class c36 implements MediaDrm.OnEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c36(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        switch (this.a) {
            case 0:
                f36 f36Var = (f36) this.b;
                sy4 sy4Var = (sy4) this.c;
                f36Var.getClass();
                cy cyVar = ((aa4) sy4Var.b).y;
                cyVar.getClass();
                cyVar.obtainMessage(i, bArr).sendToTarget();
                break;
            default:
                f36 f36Var2 = (f36) this.b;
                wd6 wd6Var = (wd6) this.c;
                f36Var2.getClass();
                cy cyVar2 = ((ba4) wd6Var.b).y;
                cyVar2.getClass();
                cyVar2.obtainMessage(i, bArr).sendToTarget();
                break;
        }
    }
}
