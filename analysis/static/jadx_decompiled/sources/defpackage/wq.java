package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* loaded from: classes.dex */
public final class wq extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(Continuation continuation, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen) {
        super(2, continuation);
        this.Y = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wq wqVar = (wq) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wqVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wq wqVar = new wq(continuation, this.Y);
        wqVar.X = obj;
        return wqVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object obj2;
        Object next;
        jqe iqeVar;
        jqe eqeVar;
        od2.a0(obj);
        er erVar = (er) this.X;
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.Y;
        appearanceSettingsMultiThemeScreen.Z.E(erVar.a);
        TextView textView = (TextView) appearanceSettingsMultiThemeScreen.o.T0(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.s0[1]);
        Iterator it = erVar.a.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((wre) next).a) {
                break;
            }
        }
        wre wreVar = (wre) next;
        if (wreVar == null) {
            iqeVar = jqe.a;
        } else {
            sba sbaVar = sba.d;
            sba sbaVar2 = wreVar.c;
            if (tpa.f(sbaVar2, sbaVar)) {
                eqeVar = new eqe(o4a.q);
            } else if (tpa.f(sbaVar2, sba.e)) {
                eqeVar = new eqe(o4a.n);
            } else if (tpa.f(sbaVar2, sba.f)) {
                eqeVar = new eqe(o4a.o);
            } else if (tpa.f(sbaVar2, sba.g)) {
                eqeVar = new eqe(o4a.p);
            } else {
                iqeVar = new iqe("Неопознанный барсук");
            }
            iqeVar = eqeVar;
        }
        textView.setText(iqeVar.b(appearanceSettingsMultiThemeScreen.getContext()));
        Iterator it2 = erVar.b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (tpa.f(((fq) next2).b, Boolean.TRUE)) {
                obj2 = next2;
                break;
            }
        }
        fq fqVar = (fq) obj2;
        if (fqVar != null) {
            ((MaterialButtonToggleGroup) appearanceSettingsMultiThemeScreen.X.T0(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.s0[2])).b((int) fqVar.getItemId(), true);
        }
        Drawable drawable = erVar.c;
        if (drawable != null) {
            ((sm2) appearanceSettingsMultiThemeScreen.c.T0(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.s0[0])).setBackgroundPreview(drawable);
        }
        return e5f.a;
    }
}
