package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class pk9 extends v2 implements nk9, nse, gp3 {
    public static final int D0 = yyb.layout_contact_location;
    public RecyclerView A0;
    public View B0;
    public ip3 C0;
    public final el3 X;
    public final m7b Y;
    public final ViewStub Z;
    public final ida o;
    public final ri4 s0;
    public Group t0;
    public TextView u0;
    public ImageView v0;
    public ProgressBar w0;
    public TextView x0;
    public TextView y0;
    public TextView z0;

    public pk9(Context context, ida idaVar, el3 el3Var, m7b m7bVar, ri4 ri4Var, ViewStub viewStub) {
        super(context);
        this.o = idaVar;
        this.X = el3Var;
        this.Y = m7bVar;
        this.s0 = ri4Var;
        this.Z = viewStub;
    }

    @Override // defpackage.nse
    public final void c() {
        View view = (View) this.c;
        if (view == null) {
            return;
        }
        fka fkaVarJ = qp4.u0.j(view);
        ((View) this.c).setBackgroundColor(fkaVarJ.b().l);
        this.u0.setTextColor(fkaVarJ.getText().h);
        this.y0.setTextColor(fkaVarJ.getText().g);
        this.x0.setTextColor(fkaVarJ.getText().g);
        this.z0.setTextColor(fkaVarJ.getText().j);
        pag.I(null, null, ngg.u(gpc.d0, fkaVarJ.getIcon().k, (Context) this.b), null, this.z0);
    }

    @Override // defpackage.v2
    public final void m() {
        this.t0 = (Group) ((View) this.c).findViewById(xxb.layout_contact_location__current_group);
        TextView textView = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__tv_name);
        this.u0 = textView;
        i4f.m.b(textView, du4.b);
        this.v0 = (ImageView) ((View) this.c).findViewById(xxb.layout_contact_location__iv_live);
        this.w0 = (ProgressBar) ((View) this.c).findViewById(xxb.layout_contact_location__pb_request_location);
        this.x0 = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__iv_update);
        TextView textView2 = this.u0;
        kqe kqeVar = i4f.p;
        kqeVar.b(textView2, du4.b);
        this.y0 = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__tv_address);
        kqeVar.b(this.u0, du4.b);
        this.z0 = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__tv_route);
        i4f.D.b(this.u0, du4.b);
        this.A0 = (RecyclerView) ((View) this.c).findViewById(xxb.layout_contact_location__rv_markers);
        this.B0 = ((View) this.c).findViewById(xxb.layout_contact_location__separator);
        c();
        ip3 ip3Var = new ip3(this.X);
        this.C0 = ip3Var;
        ip3Var.Z = this;
        ip3Var.A(true);
        this.A0.setAdapter(this.C0);
        final int i = 0;
        this.A0.setLayoutManager(new LinearLayoutManager(0, false));
        nd7.h(this.z0, new f6(this) { // from class: ok9
            public final /* synthetic */ pk9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.n(new fj0(21));
                        break;
                    default:
                        this.b.n(new fj0(22));
                        break;
                }
            }
        });
        final int i2 = 1;
        nd7.h((View) this.c, new f6(this) { // from class: ok9
            public final /* synthetic */ pk9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.n(new fj0(21));
                        break;
                    default:
                        this.b.n(new fj0(22));
                        break;
                }
            }
        });
    }
}
