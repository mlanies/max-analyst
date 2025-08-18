package defpackage;

import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class r5 extends q5 implements tsd {
    public static final /* synthetic */ int U0 = 0;

    public ai3 j0(int i) {
        setContentView(i);
        go9 go9Var = new go9(new y7g(this), (Toolbar) findViewById(xxb.toolbar));
        go9Var.c = u();
        ai3 ai3Var = new ai3(go9Var);
        Toolbar toolbar = (Toolbar) ai3Var.b;
        if (toolbar != null) {
            gte gteVar = new gte(1, ai3Var);
            WeakHashMap weakHashMap = zmf.a;
            omf.u(toolbar, gteVar);
        }
        return ai3Var;
    }
}
