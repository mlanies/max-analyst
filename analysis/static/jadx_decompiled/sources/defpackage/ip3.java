package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collections;
import java.util.List;
import ru.ok.messages.views.widgets.TamAvatarView;

/* loaded from: classes2.dex */
public final class ip3 extends hdc {
    public List X = Collections.emptyList();
    public long Y;
    public gp3 Z;
    public final el3 o;

    public ip3(el3 el3Var) {
        this.o = el3Var;
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.X.size();
    }

    @Override // defpackage.hdc
    public final long k(int i) {
        return ((e08) this.X.get(i)).c;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        hp3 hp3Var = (hp3) decVar;
        e08 e08Var = (e08) this.X.get(i);
        boolean z = e08Var.h;
        ImageView imageView = hp3Var.F0;
        TamAvatarView tamAvatarView = hp3Var.G0;
        ip3 ip3Var = hp3Var.J0;
        long j = e08Var.b;
        if (z) {
            imageView.setVisibility(4);
            tamAvatarView.setVisibility(0);
            tamAvatarView.a(ip3Var.o.i(j, false), false);
            if (e08Var.k) {
                tamAvatarView.setAlpha(1.0f);
            } else {
                tamAvatarView.setAlpha(0.5f);
            }
        } else {
            imageView.setVisibility(0);
            tamAvatarView.setVisibility(8);
            tamAvatarView.a(ip3Var.o.i(j, false), false);
        }
        long j2 = ip3Var.Y;
        long j3 = e08Var.c;
        View view = hp3Var.H0;
        if (j3 == j2) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        hp3Var.I0 = e08Var;
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new hp3(this, LayoutInflater.from(viewGroup.getContext()).inflate(yyb.row_contact_location, viewGroup, false));
    }
}
