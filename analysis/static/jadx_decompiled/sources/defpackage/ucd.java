package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ucd extends ffe implements a66 {
    public final /* synthetic */ RectF X;
    public final /* synthetic */ add Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucd(RectF rectF, add addVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = rectF;
        this.Y = addVar;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ucd ucdVar = (ucd) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ucdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ucd(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a20 a20VarH = c37.h(this.X);
        add addVar = this.Y;
        addVar.G0.set(((k4a) ((pk) addVar.v0.getValue())).F(this.Z, a20VarH));
        pnf.o(addVar.z0, new ahd(new eqe(mha.r), new Integer(woc.m)));
        return e5f.a;
    }
}
