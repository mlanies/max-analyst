package defpackage;

import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class src extends ffe implements a66 {
    public final /* synthetic */ File X;
    public final /* synthetic */ trc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public src(File file, trc trcVar, Continuation continuation) {
        super(2, continuation);
        this.X = file;
        this.Y = trcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((src) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new src(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        File file = this.X;
        ho9 ho9Var = new ho9();
        ho9Var.b = file;
        ho9Var.c = Environment.DIRECTORY_MOVIES;
        ho9Var.a = 8;
        ho9Var.d = MediaStore.Video.Media.getContentUri("external_primary");
        trc trcVar = this.Y;
        return ((yd) trcVar.a).c(ho9Var, trcVar.a.a());
    }
}
