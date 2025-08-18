package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.c;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.Objects;

/* loaded from: classes.dex */
public final class je extends rd7 implements k56 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ IntentSender b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent o;
    public final /* synthetic */ Bundle s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je(Object obj, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle, int i5) {
        super(0);
        this.a = i5;
        this.t0 = obj;
        this.b = intentSender;
        this.c = i;
        this.o = intent;
        this.X = i2;
        this.Y = i3;
        this.Z = i4;
        this.s0 = bundle;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) this.t0;
                if (androidXLifecycleHandlerImpl.G0 == null) {
                    throw new IllegalStateException("Fragment " + androidXLifecycleHandlerImpl + " not attached to Activity");
                }
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
                IntentSender intentSender = this.b;
                Intent intent = this.o;
                Bundle bundle = this.s0;
                if (zIsLoggable) {
                    androidXLifecycleHandlerImpl.toString();
                    Objects.toString(intentSender);
                    Objects.toString(intent);
                    Objects.toString(bundle);
                }
                c cVarF0 = androidXLifecycleHandlerImpl.f0();
                pl8 pl8Var = cVarF0.D;
                int i = this.c;
                int i2 = this.X;
                int i3 = this.Y;
                if (pl8Var != null) {
                    if (bundle != null) {
                        if (intent == null) {
                            intent = new Intent();
                            intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                        }
                        if (Log.isLoggable("FragmentManager", 2)) {
                            bundle.toString();
                            intent.toString();
                            Objects.toString(androidXLifecycleHandlerImpl);
                        }
                        intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                    }
                    n37 n37Var = new n37(intentSender, intent, i2, i3);
                    cVarF0.F.addLast(new i16(androidXLifecycleHandlerImpl.Y, i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        androidXLifecycleHandlerImpl.toString();
                    }
                    cVarF0.D.C(n37Var);
                } else {
                    z06 z06Var = cVarF0.w;
                    if (i != -1) {
                        z06Var.getClass();
                        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                    }
                    Activity activity = z06Var.t0;
                    if (activity == null) {
                        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                    }
                    activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, this.Z, bundle);
                }
                return e5f.a;
            default:
                ((w2b) this.t0).startIntentSenderForResult(this.b, this.c, this.o, this.X, this.Y, this.Z, this.s0);
                return e5f.a;
        }
    }
}
