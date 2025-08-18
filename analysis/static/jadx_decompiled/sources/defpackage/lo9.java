package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lo9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mo9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo9(mo9 mo9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = mo9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lo9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lo9 lo9Var = new lo9(this.Z, continuation);
        lo9Var.Y = obj;
        return lo9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        njc njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            mo9 mo9Var = this.Z;
            try {
                mo9Var.k = String.valueOf(System.currentTimeMillis());
                Uri uriFromFile = Uri.fromFile(((kk5) mo9Var.b.getValue()).q(mo9Var.k));
                String string = uriFromFile.toString();
                int i2 = tfg.c;
                if (!string.startsWith("content://")) {
                    uriFromFile = ((kk5) mo9Var.b.getValue()).f((Context) mo9Var.c.getValue(), ft.A(uriFromFile));
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", uriFromFile);
                intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                njcVar = intent;
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            mo9 mo9Var2 = this.Z;
            Throwable thA = pjc.a(njcVar);
            if (thA != null) {
                hm9.p(sx3Var.getClass().getName(), "capturePhoto: failed to capture photo", thA);
                mo9Var2.a();
            }
            mo9 mo9Var3 = this.Z;
            if (!(njcVar instanceof njc)) {
                kld kldVar = mo9Var3.g;
                cd0 cd0Var = new cd0((Intent) njcVar);
                this.Y = njcVar;
                this.X = 1;
                if (kldVar.a(cd0Var, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
