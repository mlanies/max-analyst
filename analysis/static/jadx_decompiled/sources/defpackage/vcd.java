package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vcd extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ add Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcd(Intent intent, add addVar, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = addVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vcd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vcd(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5fVar = e5f.a;
        if (rectF == null) {
            return e5fVar;
        }
        bc7[] bc7VarArr = add.K0;
        add addVar = this.Y;
        String absolutePath = ((kk5) addVar.u0.getValue()).q((String) addVar.F0.get()).getAbsolutePath();
        j47.T(addVar.a, ((w9a) addVar.r()).b(), null, new ucd(rectF, addVar, absolutePath, null), 2);
        return e5fVar;
    }
}
