package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hj6 extends ffe implements a66 {
    public File X;
    public int Y;
    public final /* synthetic */ ij6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj6(ij6 ij6Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ij6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hj6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hj6(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        File file;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        ij6 ij6Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            File fileI = ((kk5) ij6Var.c.getValue()).i("oneme_heap_dump.hprof");
            Debug.dumpHprofData(fileI.getAbsolutePath());
            cx7 immediate = ((w9a) ((kke) ij6Var.b.getValue())).c().getImmediate();
            gj6 gj6Var = new gj6(ij6Var, fileI, null);
            this.X = fileI;
            this.Y = 1;
            if (j47.t0(immediate, gj6Var, this) == tx3Var) {
                return tx3Var;
            }
            file = fileI;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.X;
            od2.a0(obj);
        }
        Context context = (Context) ij6Var.a.getValue();
        Uri uriF = ((kk5) ij6Var.c.getValue()).f(context, file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", uriF);
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        intentCreateChooser.addFlags(268435456);
        Iterator<T> it = context.getPackageManager().queryIntentActivities(intentCreateChooser, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriF, 3);
        }
        context.startActivity(intentCreateChooser);
        return e5f.a;
    }
}
