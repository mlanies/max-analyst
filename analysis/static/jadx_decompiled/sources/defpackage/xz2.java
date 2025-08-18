package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.widgets.TamAvatarView;

/* loaded from: classes2.dex */
public final class xz2 extends jcd {
    public final /* synthetic */ int P0;
    public final View Q0;
    public final View R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(View view, FrgBaseSettings frgBaseSettings, int i) {
        super(view, frgBaseSettings);
        final int i2 = 0;
        this.P0 = i;
        switch (i) {
            case 3:
                super(view, frgBaseSettings);
                if (frgBaseSettings != null) {
                    nd7.h(view, new f6(this) { // from class: fse
                        public final /* synthetic */ xz2 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.f6
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    xz2 xz2Var = this.b;
                                    gcd gcdVar = xz2Var.M0;
                                    xz2Var.N0.u1(gcdVar.a, gcdVar.X);
                                    break;
                                default:
                                    xz2 xz2Var2 = this.b;
                                    xz2Var2.N0.t1(xz2Var2.M0.a);
                                    break;
                            }
                        }
                    });
                }
                Context context = view.getContext();
                khe kheVar = sme.a0;
                sme smeVarR = fm9.R(context);
                ImageView imageView = (ImageView) view.findViewById(xxb.row_setting_theme__iv__selected);
                this.R0 = imageView;
                imageView.setColorFilter(smeVarR.k);
                ImageView imageView2 = (ImageView) view.findViewById(xxb.row_setting_theme__iv__forward);
                this.Q0 = imageView2;
                imageView2.setColorFilter(smeVarR.k);
                imageView2.setBackground(smeVarR.a());
                if (frgBaseSettings != null) {
                    final int i3 = 1;
                    nd7.h(imageView2, new f6(this) { // from class: fse
                        public final /* synthetic */ xz2 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.f6
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    xz2 xz2Var = this.b;
                                    gcd gcdVar = xz2Var.M0;
                                    xz2Var.N0.u1(gcdVar.a, gcdVar.X);
                                    break;
                                default:
                                    xz2 xz2Var2 = this.b;
                                    xz2Var2.N0.t1(xz2Var2.M0.a);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                this.R0 = (TamAvatarView) view.findViewById(xxb.row_setting_contact__av_view);
                TextView textView = (TextView) view.findViewById(xxb.row_contact_base__tv_name);
                this.Q0 = textView;
                new vqe(textView, c54.a(textView.getContext())).a();
                textView.setTextColor(this.O0.F);
                ((TextView) view.findViewById(xxb.row_contact_base__tv_last_seen)).setTextColor(this.O0.M);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    @Override // defpackage.jcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.gcd r5, boolean r6) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz2.A(gcd, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(ViewGroup viewGroup, LayoutInflater layoutInflater, FrgBaseSettings frgBaseSettings, int i) {
        super(viewGroup, frgBaseSettings);
        this.P0 = i;
        switch (i) {
            case 2:
                super(viewGroup, frgBaseSettings);
                View viewInflate = layoutInflater.inflate(yyb.row_setting_online, viewGroup, false);
                View viewFindViewById = viewInflate.findViewById(xxb.row_setting_online__circle);
                this.R0 = viewFindViewById;
                viewFindViewById.setBackground(hm9.S(Integer.valueOf(this.O0.k), null, null));
                TextView textView = (TextView) viewInflate.findViewById(xxb.row_setting_online__tv);
                this.Q0 = textView;
                Context context = textView.getContext();
                khe kheVar = sme.a0;
                textView.setTextColor(fm9.R(context).F);
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(xxb.row_setting__fl_value);
                frameLayout.addView(viewInflate);
                frameLayout.setVisibility(0);
                break;
            default:
                Context context2 = viewGroup.getContext();
                khe kheVar2 = sme.a0;
                sme smeVarR = fm9.R(context2);
                View viewInflate2 = layoutInflater.inflate(yyb.row_setting_checkbox, viewGroup, false);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(xxb.row_setting__fl_value);
                frameLayout2.addView(viewInflate2);
                frameLayout2.setVisibility(0);
                SwitchCompat switchCompat = (SwitchCompat) viewInflate2.findViewById(xxb.row_checkbox_setting__cb_check);
                this.R0 = switchCompat;
                ngg.h(smeVarR, switchCompat);
                TextView textView2 = (TextView) viewInflate2.findViewById(xxb.row_checkbox_setting__tv_value);
                this.Q0 = textView2;
                textView2.setTextColor(smeVarR.M);
                j47.U(this.I0, this.F0.C);
                viewGroup.setOnClickListener(new c5(18, this));
                break;
        }
    }
}
