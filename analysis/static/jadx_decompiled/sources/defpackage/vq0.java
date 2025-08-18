package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.ProfileScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class vq0 implements c66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, final Object obj3) {
        int i;
        Object next;
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                ((Boolean) obj2).getClass();
                fka fkaVar = (fka) obj3;
                int iS = au1.s(((wq0) this.b).J0);
                if (iS == 0) {
                    i = fkaVar.getIcon().a.c.a;
                } else {
                    if (iS != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = fkaVar.getIcon().a.c.b;
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return e5f.a;
            case 1:
                final z3d z3dVar = (z3d) obj;
                final zt0 zt0Var = (zt0) this.b;
                return new c66() { // from class: st0
                    @Override // defpackage.c66
                    public final Object invoke(Object obj4, Object obj5, Object obj6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        Symbol symbol = bu0.l;
                        Object obj7 = obj3;
                        if (obj7 != symbol) {
                            OnUndeliveredElementKt.callUndeliveredElement(zt0Var.b, obj7, ((y3d) z3dVar).a);
                        }
                        return e5f.a;
                    }
                };
            case 2:
                ((m56) this.b).invoke((Throwable) obj);
                return e5f.a;
            case 3:
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
                long jLongValue = ((Long) obj).longValue();
                v5c v5cVar = (v5c) obj2;
                View view = (View) obj3;
                y6c y6cVar = messagesListWidget.W0;
                if (y6cVar != null) {
                    Iterator it = y6cVar.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            v6c v6cVar = (v6c) next;
                            if (v6cVar.a != jLongValue || !tpa.f(v6cVar.c, v5cVar)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    v6c v6cVar2 = (v6c) next;
                    if (v6cVar2 == null) {
                        String str = y6cVar.d;
                        ir6 ir6Var = hm9.m;
                        if (ir6Var != null && ir6Var.c()) {
                            ir6Var.d(us7.X, str, "Can't play reaction effect because don't have state, reaction:" + ((Object) v5cVar) + ", l:" + jLongValue, null);
                        }
                    } else {
                        dec decVarN = y6cVar.a.N(v6cVar2.a);
                        if (y6cVar.f(decVarN != null ? decVarN.h() : -1)) {
                            String str2 = y6cVar.d;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, str2, "Make reaction effect pending, reaction:" + ((Object) v5cVar) + ", msgId:" + jLongValue, null);
                            }
                            y6cVar.f.add(Long.valueOf(v6cVar2.a));
                        } else {
                            y6cVar.f.remove(Long.valueOf(v6cVar2.a));
                            y6cVar.e.remove(v6cVar2);
                            View view2 = decVarN.a;
                            pla.a(view2, new wxe(view2, y6cVar, view, v6cVar2, v5cVar, jLongValue));
                        }
                    }
                }
                return e5f.a;
            case 4:
                x6g x6gVar = (x6g) obj2;
                bc7[] bc7VarArr = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                profileScreen.getClass();
                fm fmVar = (fm) profileScreen.X.T0(profileScreen, ProfileScreen.D0[0]);
                fmVar.setPadding(fmVar.getPaddingLeft(), tu0.G(4 * fk4.d().getDisplayMetrics().density), fmVar.getPaddingRight(), fmVar.getPaddingBottom());
                return x6gVar;
            default:
                ((f5d) this.b).c();
                return e5f.a;
        }
    }
}
