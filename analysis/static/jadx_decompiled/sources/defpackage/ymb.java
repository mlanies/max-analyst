package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ymb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymb(cnb cnbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ymb ymbVar = (ymb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ymbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ymb ymbVar = new ymb(this.Y, continuation);
        ymbVar.X = obj;
        return ymbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        cnb cnbVar = this.Y;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        try {
            AtomicReference atomicReference = cnbVar.P0;
            je7 je7Var = cnbVar.v0;
            Uri uriFromFile = Uri.fromFile(((kk5) je7Var.getValue()).q((String) atomicReference.updateAndGet(new oe2(9))));
            String string = uriFromFile.toString();
            int i = tfg.c;
            if (!string.startsWith("content://")) {
                uriFromFile = ((kk5) je7Var.getValue()).f(cnbVar.Q0, ft.A(uriFromFile));
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
            cnbVar.z();
        }
        if (!(njcVar instanceof njc)) {
            pnf.o(cnbVar.z0, new tlb((Intent) njcVar));
        }
        return e5f.a;
    }
}
