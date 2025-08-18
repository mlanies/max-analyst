package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u36 extends brd {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u36(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        boolean z;
        switch (this.b) {
            case 0:
                ((AtomicBoolean) this.c).set(((p7b) ((m7b) v4Var.c(m7b.class))).a.g.getBoolean("app.debug.fresco", false));
                b46 b46Var = b46.a;
                Context context = (Context) v4Var.c(Context.class);
                kv6 kv6Var = (kv6) v4Var.c(kv6.class);
                iba ibaVar = (iba) v4Var.c(iba.class);
                final AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                List<cq4> listSingletonList = Collections.singletonList(new bp7());
                ta5.a = new y36();
                ta5.a.j(atomicBoolean.get() ? 2 : 6);
                f46.a = new ob6();
                ty2 ty2Var = new ty2();
                nw4 nw4Var = new nw4(6);
                nw4Var.c = new ide() { // from class: z36
                    @Override // defpackage.ide
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                };
                nw4Var.o = ty2Var;
                for (cq4 cq4Var : listSingletonList) {
                    if (((ArrayList) nw4Var.b) == null) {
                        nw4Var.b = new ArrayList();
                    }
                    ((ArrayList) nw4Var.b).add(cq4Var);
                }
                vq7 vq7Var = new vq7(nw4Var);
                f46.I();
                if (!s36.b) {
                    s36.b = true;
                } else if (ta5.a.i(5)) {
                    ta5.a.w(s36.class.getSimpleName(), "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
                }
                nu0.D0 = true;
                synchronized (hm9.class) {
                    z = hm9.a != null;
                }
                if (!z) {
                    f46.I();
                    try {
                        try {
                            try {
                                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                            } catch (ClassNotFoundException unused) {
                                hm9.I(new oq9(17));
                            } catch (NoSuchMethodException unused2) {
                                hm9.I(new oq9(17));
                            }
                        } catch (IllegalAccessException unused3) {
                            hm9.I(new oq9(17));
                        } catch (InvocationTargetException unused4) {
                            hm9.I(new oq9(17));
                        }
                        f46.I();
                    } catch (Throwable th) {
                        f46.I();
                        throw th;
                    }
                }
                Context applicationContext = context.getApplicationContext();
                synchronized (lv6.class) {
                    try {
                        if (lv6.p != null && ta5.a.i(5)) {
                            ta5.a.w(lv6.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                        }
                        lv6.p = new lv6(kv6Var);
                    } finally {
                    }
                }
                f46.I();
                f2b f2bVar = new f2b(applicationContext, vq7Var);
                s36.a = f2bVar;
                SimpleDraweeView.w0 = f2bVar;
                f46.I();
                f46.I();
                lv6 lv6VarG = lv6.g();
                Resources resources = context.getResources();
                bg4 bg4VarH = bg4.h();
                j84 j84VarA = lv6VarG.a();
                lv6VarG.b.v.getClass();
                a46 a46Var = new a46(ibaVar.a());
                y7g y7gVarD = lv6VarG.d();
                wz wzVar = (wz) vq7Var.b;
                ide ideVar = new ide() { // from class: z36
                    @Override // defpackage.ide
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                };
                ty2Var.a = resources;
                ty2Var.b = bg4VarH;
                ty2Var.c = j84VarA;
                ty2Var.o = a46Var;
                ty2Var.X = y7gVarD;
                ty2Var.Y = wzVar;
                ty2Var.Z = ideVar;
                return b46Var;
            case 1:
                return new io0((y8) this.c, v4Var.d(iv6.class), v4Var.d(lv6.class));
            default:
                return new t33((Context) v4Var.c(Context.class), (cj4) ((je7) this.c).getValue(), (mi5) v4Var.c(mi5.class));
        }
    }
}
