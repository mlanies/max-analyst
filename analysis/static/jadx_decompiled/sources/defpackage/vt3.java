package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class vt3 extends hqd {
    public final /* synthetic */ int F0 = 3;
    public final Object G0;
    public final Object H0;
    public Object I0;

    public vt3(Context context, gw7 gw7Var, ExecutorService executorService, t5e t5eVar) {
        s5e s5eVar = new s5e(context);
        s5eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        super(s5eVar);
        this.G0 = s5eVar;
        a3g a3gVar = new a3g(executorService, new u5e(t5eVar));
        this.H0 = a3gVar;
        s5eVar.setHeaderClickAction(new zja(this, 25, t5eVar));
        RecyclerView recyclerView = s5eVar.b;
        if (gw7Var != null) {
            recyclerView.k(new yc7(5, gw7Var));
        }
        recyclerView.setAdapter(a3gVar);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        switch (this.F0) {
            case 0:
                if (ol7Var instanceof ut3) {
                    ViewGroup viewGroup = (ViewGroup) this.I0;
                    if (viewGroup.getChildCount() <= 0) {
                        Context context = this.a.getContext();
                        List list = (List) ((ut3) ol7Var).a;
                        ((xxc) this.G0).getClass();
                        viewGroup.addView(xxc.i(context, list, (m56) this.H0));
                        break;
                    }
                }
                break;
            case 1:
                if (ol7Var instanceof jn8) {
                    jn8 jn8Var = (jn8) ol7Var;
                    this.I0 = jn8Var;
                    long j = jn8Var.a;
                    String str = jn8Var.o;
                    lk3 lk3Var = (lk3) this.G0;
                    CharSequence charSequence = jn8Var.b;
                    lk3Var.O(j, charSequence, str);
                    lk3Var.setName(charSequence);
                    v5c v5cVar = jn8Var.s0;
                    ((TextView) this.H0).setText(v5cVar != null ? v5cVar.a : null);
                    break;
                }
                break;
            case 2:
                if (ol7Var instanceof w3e) {
                    w3e w3eVar = (w3e) ol7Var;
                    this.I0 = w3eVar;
                    List list2 = w3eVar.X;
                    int size = list2.size();
                    s5e s5eVar = (s5e) this.G0;
                    String str2 = String.format(s5eVar.getContext().getResources().getQuantityString(uga.a, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    CharSequence charSequenceB = w3eVar.b.b(s5eVar.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    boolean z = w3eVar.s0;
                    int i = z ? vga.b : vga.a;
                    b7a b7aVar = z ? b7a.b : b7a.a;
                    v5e v5eVar = s5eVar.a;
                    v5eVar.a.setText(charSequenceB);
                    v5eVar.b.setText(str2);
                    OneMeButton oneMeButton = v5eVar.c;
                    oneMeButton.setText(i);
                    oneMeButton.setMode(b7aVar);
                    oneMeButton.setVisibility(0);
                    ((a3g) this.H0).E(list2);
                    break;
                }
                break;
            default:
                n55 n55Var = (n55) ol7Var;
                ((TextView) this.G0).setText(n55Var.a);
                StringBuilder sb = new StringBuilder();
                sb.append("completedTasks: ");
                sb.append(n55Var.c);
                sb.append(", activeTasks: ");
                int i2 = n55Var.o;
                sb.append(i2);
                sb.append(", idleThreads: ");
                sb.append(n55Var.b);
                sb.append(", tasksInQueue: ");
                sb.append(i2);
                ((TextView) this.H0).setText(sb);
                ((TextView) this.I0).setText("isShutdown: " + n55Var.Y + ", isTerminated: " + n55Var.Z);
                break;
        }
    }

    @Override // defpackage.hqd
    public void B(ol7 ol7Var, Object obj) {
        switch (this.F0) {
            case 1:
                if (!(obj instanceof in8)) {
                    A(ol7Var);
                    break;
                } else {
                    v5c v5cVar = ((in8) obj).a;
                    ((TextView) this.H0).setText(v5cVar != null ? v5cVar.a : null);
                    break;
                }
            default:
                super.B(ol7Var, obj);
                break;
        }
    }

    public vt3(Context context, xxc xxcVar, pt8 pt8Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        super(frameLayout);
        this.G0 = xxcVar;
        this.H0 = pt8Var;
        this.I0 = frameLayout;
    }

    public vt3(Context context, om8 om8Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new pdc(-1, -2));
        lk3 lk3Var = new lk3(context, null);
        int i = mda.G;
        lk3Var.setId(i);
        lk3Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 16));
        float f = 24;
        lk3Var.setPadding(0, lk3Var.getPaddingTop(), rh4.c(12, fk4.d().getDisplayMetrics().density, tu0.G(fk4.d().getDisplayMetrics().density * f)), lk3Var.getPaddingBottom());
        frameLayout.addView(lk3Var);
        TextView textView = new TextView(context);
        int i2 = mda.H;
        textView.setId(i2);
        int iG = tu0.G(f * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(new FrameLayout.LayoutParams(iG, iG, 8388629));
        textView.setGravity(17);
        textView.setTextSize(1, 16.0f);
        frameLayout.addView(textView);
        super(frameLayout);
        this.G0 = (lk3) frameLayout.findViewById(i);
        this.H0 = (TextView) frameLayout.findViewById(i2);
        tu0.K(frameLayout, 300L, new vu5(this, 16, om8Var));
    }

    public vt3(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(yvb.threads_state_state_view);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(18.0f);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        float f = 5;
        layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(-16776961);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        textView3.setLayoutParams(layoutParams3);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(-16776961);
        linearLayout.addView(textView3);
        super(linearLayout);
        this.G0 = (TextView) linearLayout.getChildAt(0);
        this.H0 = (TextView) linearLayout.getChildAt(1);
        this.I0 = (TextView) linearLayout.getChildAt(2);
    }
}
