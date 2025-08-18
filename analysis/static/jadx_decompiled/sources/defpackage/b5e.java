package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class b5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5e(Continuation continuation, StickersScreen stickersScreen, View view) {
        super(2, continuation);
        this.Y = stickersScreen;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        b5e b5eVar = (b5e) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        b5eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b5e b5eVar = new b5e(continuation, this.Y, this.Z);
        b5eVar.X = obj;
        return b5eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        StickersScreen stickersScreen = this.Y;
        a5e a5eVar = stickersScreen.a;
        a5e a5eVar2 = a5e.X;
        View view = this.Z;
        if (a5eVar == a5eVar2) {
            qm0 qm0Var = stickersScreen.Z;
            if (!qm0Var.a()) {
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    ay7.b(viewGroup, (View) qm0Var.getValue(), -1);
                }
                View view2 = (View) qm0Var.getValue();
                pla.a(view2, new h76(view2, 24, stickersScreen));
            }
        }
        stickersScreen.u0.E(list);
        boolean zIsEmpty = list.isEmpty();
        qm0 qm0Var2 = stickersScreen.Y;
        if (zIsEmpty) {
            ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup2 != null) {
                ay7.b(viewGroup2, (View) qm0Var2.getValue(), -1);
            }
            if (qm0Var2.a()) {
                o4e o4eVar = (o4e) qm0Var2.getValue();
                a5e a5eVar3 = a5e.c;
                a5e a5eVar4 = stickersScreen.a;
                o4eVar.setTitle(a5eVar4 == a5eVar3 ? hja.c : hja.a);
                o4eVar.setSubtitle(a5eVar4 == a5eVar3 ? Integer.valueOf(hja.b) : null);
                o4eVar.setIcon(fja.b);
            }
            ((View) qm0Var2.getValue()).setVisibility(0);
            stickersScreen.m0().setVisibility(8);
            stickersScreen.n0().setRightActions(nka.a);
        } else {
            stickersScreen.m0().setVisibility(0);
            j47.P(qm0Var2);
            stickersScreen.n0().setRightActions(new rka(new om8(1, this.Y, StickersScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 16)));
        }
        return e5f.a;
    }
}
