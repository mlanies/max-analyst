package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rgb extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ vgb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgb(Intent intent, vgb vgbVar, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = vgbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rgb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rgb(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5fVar = e5f.a;
        if (rectF == null) {
            return e5fVar;
        }
        bc7[] bc7VarArr = vgb.A0;
        vgb vgbVar = this.Y;
        String absolutePath = ((kk5) vgbVar.Y.getValue()).q((String) vgbVar.z0.get()).getAbsolutePath();
        j47.T(vgbVar.a, ((w9a) vgbVar.q()).b(), null, new qgb(vgbVar, absolutePath, rectF, null), 2);
        return e5fVar;
    }
}
