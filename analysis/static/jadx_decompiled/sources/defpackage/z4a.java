package defpackage;

import android.content.res.Configuration;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class z4a extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeApplication Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4a(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z4a z4aVar = (z4a) n((du4) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z4aVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        z4a z4aVar = new z4a(this.Y, continuation);
        z4aVar.X = obj;
        return z4aVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        hm9.n("OneMeDynamicFont", "change dynamic font to " + ((du4) this.X).ordinal());
        OneMeApplication oneMeApplication = this.Y;
        Configuration configuration = new Configuration(oneMeApplication.getResources().getConfiguration());
        int iFloatToRawIntBits = Float.floatToRawIntBits(configuration.fontScale);
        n4c.a.getClass();
        configuration.fontScale = Float.intBitsToFloat(iFloatToRawIntBits + (n4c.b.b() ? -1 : 1));
        oneMeApplication.getResources().updateConfiguration(configuration, oneMeApplication.getResources().getDisplayMetrics());
        oneMeApplication.onConfigurationChanged(configuration);
        return e5f.a;
    }
}
