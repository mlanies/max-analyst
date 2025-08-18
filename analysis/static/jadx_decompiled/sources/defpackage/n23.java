package defpackage;

import android.content.Context;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n23 {
    public final /* synthetic */ o23 a;

    public n23(o23 o23Var) {
        this.a = o23Var;
    }

    @uae
    public final void onEvent(nu7 nu7Var) {
        o23 o23Var = this.a;
        try {
            try {
                xie xieVar = (xie) ((je7) o23Var.X).getValue();
                xieVar.getClass();
                sa3 sa3Var = new sa3(0, new vpc(hz4.a, new rie(xieVar, null)));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ztc ztcVarA = muc.a();
                Objects.requireNonNull(timeUnit, "unit is null");
                Objects.requireNonNull(ztcVarA, "scheduler is null");
                new gb3(sa3Var, timeUnit, ztcVarA).a();
            } catch (Exception e) {
                hm9.p((String) o23Var.b, "error while delete token", e);
            }
            ProcessPhoenix.b((Context) o23Var.a);
        } finally {
            try {
            } finally {
            }
        }
    }
}
