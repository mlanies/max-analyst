package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.storage.ui.SettingsStorageScreen;

/* loaded from: classes2.dex */
public final class hid extends ppd {
    public final rxd X;

    public hid(rxd rxdVar, ExecutorService executorService) {
        super(executorService);
        this.X = rxdVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        boolean z = hqdVar instanceof gid;
        final rxd rxdVar = this.X;
        if (z) {
            gid gidVar = (gid) hqdVar;
            ol7 ol7Var = (ol7) C(i);
            if (ol7Var instanceof k1d) {
                gidVar.A(ol7Var);
                final k1d k1dVar = (k1d) ol7Var;
                final int i2 = 1;
                tu0.K((ufd) gidVar.a, 300L, new View.OnClickListener() { // from class: eid
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        rxd rxdVar2 = rxdVar;
                        ol7 ol7Var2 = k1dVar;
                        switch (i2) {
                            case 0:
                                long j = ((i1d) ol7Var2).b;
                                rxdVar2.getClass();
                                bc7[] bc7VarArr = SettingsStorageScreen.X;
                                ((vid) ((SettingsStorageScreen) rxdVar2.b).a.getValue()).t((int) j);
                                break;
                            default:
                                long j2 = ((k1d) ol7Var2).o;
                                rxdVar2.getClass();
                                bc7[] bc7VarArr2 = SettingsStorageScreen.X;
                                ((vid) ((SettingsStorageScreen) rxdVar2.b).a.getValue()).t((int) j2);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (!(hqdVar instanceof fid)) {
            hqdVar.A((ol7) C(i));
            return;
        }
        fid fidVar = (fid) hqdVar;
        ol7 ol7Var2 = (ol7) C(i);
        if (ol7Var2 instanceof i1d) {
            fidVar.A(ol7Var2);
            final i1d i1dVar = (i1d) ol7Var2;
            final int i3 = 0;
            tu0.K((OneMeButton) fidVar.a, 300L, new View.OnClickListener() { // from class: eid
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rxd rxdVar2 = rxdVar;
                    ol7 ol7Var22 = i1dVar;
                    switch (i3) {
                        case 0:
                            long j = ((i1d) ol7Var22).b;
                            rxdVar2.getClass();
                            bc7[] bc7VarArr = SettingsStorageScreen.X;
                            ((vid) ((SettingsStorageScreen) rxdVar2.b).a.getValue()).t((int) j);
                            break;
                        default:
                            long j2 = ((k1d) ol7Var22).o;
                            rxdVar2.getClass();
                            bc7[] bc7VarArr2 = SettingsStorageScreen.X;
                            ((vid) ((SettingsStorageScreen) rxdVar2.b).a.getValue()).t((int) j2);
                            break;
                    }
                }
            });
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i == nha.H) {
            return new gid(new ufd(viewGroup.getContext(), null));
        }
        if (i == nha.G) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = 16;
            float f2 = 4;
            textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            i4f.u.b(textView, du4.b);
            v3c.y(new v9(3, null, 24), textView);
            return new az0(textView, 16);
        }
        if (i != nha.F) {
            String name = hid.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), null);
            }
            return new az0(new View(viewGroup.getContext()), 17);
        }
        OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        layoutParams.leftMargin = iG;
        layoutParams.rightMargin = iG;
        layoutParams.topMargin = iG;
        layoutParams.bottomMargin = iG;
        oneMeButton.setLayoutParams(layoutParams);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        return new fid(oneMeButton);
    }
}
