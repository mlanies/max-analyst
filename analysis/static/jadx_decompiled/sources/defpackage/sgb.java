package defpackage;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgb(vgb vgbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vgbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sgb sgbVar = (sgb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sgbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sgb sgbVar = new sgb(this.Y, continuation);
        sgbVar.X = obj;
        return sgbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        vgb vgbVar = this.Y;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        try {
            AtomicReference atomicReference = vgbVar.z0;
            je7 je7Var = vgbVar.Y;
            atomicReference.set(String.valueOf(System.currentTimeMillis()));
            Uri uriFromFile = Uri.fromFile(((kk5) je7Var.getValue()).q((String) vgbVar.z0.get()));
            String string = uriFromFile.toString();
            int i = tfg.c;
            if (!string.startsWith("content://")) {
                uriFromFile = ((kk5) je7Var.getValue()).f((Application) vgbVar.Z.getValue(), ft.A(uriFromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriFromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            njcVar = intent;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(sx3Var.getClass().getName(), "capturePhoto: failed to capture photo", thA);
            vgbVar.s();
        }
        if (!(njcVar instanceof njc)) {
            pnf.o(vgbVar.w0, new pfb((Intent) njcVar));
        }
        return e5f.a;
    }
}
