package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextPaint;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class br extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                br brVar = new br(3, (Continuation) obj3, 0);
                brVar.Y = (MaterialButton) obj;
                e5f e5fVar = e5f.a;
                brVar.o(e5fVar);
                return e5fVar;
            case 1:
                br brVar2 = new br((ug0) this.Y, (Continuation) obj3, 1);
                e5f e5fVar2 = e5f.a;
                brVar2.o(e5fVar2);
                return e5fVar2;
            case 2:
                br brVar3 = new br(3, (Continuation) obj3, 2);
                brVar3.Y = (qv0) obj;
                e5f e5fVar3 = e5f.a;
                brVar3.o(e5fVar3);
                return e5fVar3;
            case 3:
                br brVar4 = new br(3, (Continuation) obj3, 3);
                brVar4.Y = (AppCompatTextView) obj;
                e5f e5fVar4 = e5f.a;
                brVar4.o(e5fVar4);
                return e5fVar4;
            case 4:
                br brVar5 = new br(3, (Continuation) obj3, 4);
                brVar5.Y = (w12) obj;
                e5f e5fVar5 = e5f.a;
                brVar5.o(e5fVar5);
                return e5fVar5;
            case 5:
                br brVar6 = new br(3, (Continuation) obj3, 5);
                brVar6.Y = (CoordinatorLayout) obj;
                e5f e5fVar6 = e5f.a;
                brVar6.o(e5fVar6);
                return e5fVar6;
            case 6:
                br brVar7 = new br((mw4) this.Y, (Continuation) obj3, 6);
                e5f e5fVar7 = e5f.a;
                brVar7.o(e5fVar7);
                return e5fVar7;
            case 7:
                br brVar8 = new br(3, (Continuation) obj3, 7);
                brVar8.Y = (ConstraintLayout) obj;
                e5f e5fVar8 = e5f.a;
                brVar8.o(e5fVar8);
                return e5fVar8;
            case 8:
                br brVar9 = new br(3, (Continuation) obj3, 8);
                brVar9.Y = (EndlessRecyclerView2) obj;
                e5f e5fVar9 = e5f.a;
                brVar9.o(e5fVar9);
                return e5fVar9;
            case 9:
                br brVar10 = new br((MainActivity) this.Y, (Continuation) obj3, 9);
                e5f e5fVar10 = e5f.a;
                brVar10.o(e5fVar10);
                return e5fVar10;
            case 10:
                br brVar11 = new br(3, (Continuation) obj3, 10);
                brVar11.Y = (csb) obj;
                e5f e5fVar11 = e5f.a;
                brVar11.o(e5fVar11);
                return e5fVar11;
            case 11:
                br brVar12 = new br(3, (Continuation) obj3, 11);
                brVar12.Y = (ImageView) obj;
                e5f e5fVar12 = e5f.a;
                brVar12.o(e5fVar12);
                return e5fVar12;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                br brVar13 = new br((rta) this.Y, (Continuation) obj3, 12);
                e5f e5fVar13 = e5f.a;
                brVar13.o(e5fVar13);
                return e5fVar13;
            case 13:
                br brVar14 = new br(3, (Continuation) obj3, 13);
                brVar14.Y = (g6b) obj;
                e5f e5fVar14 = e5f.a;
                brVar14.o(e5fVar14);
                return e5fVar14;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                br brVar15 = new br(3, (Continuation) obj3, 14);
                brVar15.Y = (f6b) obj;
                e5f e5fVar15 = e5f.a;
                brVar15.o(e5fVar15);
                return e5fVar15;
            default:
                br brVar16 = new br((mec) this.Y, (Continuation) obj3, 15);
                e5f e5fVar16 = e5f.a;
                brVar16.o(e5fVar16);
                return e5fVar16;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        pq9 pq9Var = qp4.u0;
        e5f e5fVar = e5f.a;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                MaterialButton materialButton = (MaterialButton) this.Y;
                int[][] iArr = {new int[]{R.attr.state_checked}, new int[]{-16842912}};
                xoe text = pq9Var.j(materialButton).getText();
                materialButton.setTextColor(new ColorStateList(iArr, new int[]{text.j, pq9Var.j(materialButton).getText().g}));
                int[][] iArr2 = {new int[]{R.attr.state_checked}, new int[]{-16842912}};
                ne0 ne0VarB = pq9Var.j(materialButton).b();
                materialButton.setBackgroundTintList(new ColorStateList(iArr2, new int[]{ne0VarB.g, pq9Var.j(materialButton).b().j}));
                materialButton.setStrokeColor(ColorStateList.valueOf(pq9Var.j(materialButton).i().b.b));
                break;
            case 1:
                od2.a0(obj);
                ug0 ug0Var = (ug0) this.Y;
                ug0Var.a.unregisterActivityLifecycleCallbacks(ug0Var.f);
                break;
            case 2:
                od2.a0(obj);
                qv0 qv0Var = (qv0) this.Y;
                TextPaint textPaint = qv0Var.A0;
                pq9Var.j(qv0Var).getText();
                textPaint.setColor(-1);
                qv0Var.B0.setColor(pq9Var.j(qv0Var).getText().e);
                boolean z = qv0Var.R0;
                Paint paint = qv0Var.x0;
                if (z) {
                    paint.setColor(pq9Var.j(qv0Var).a().s().b.e);
                } else {
                    paint.setColor(pq9Var.j(qv0Var).a().d(true).a.a.a);
                }
                qv0Var.y0.setColor(pq9Var.j(qv0Var).a().s().b.m);
                qv0Var.z0.setColor(pq9Var.j(qv0Var).a().d(true).a.a.c);
                sz6 sz6Var = qv0Var.L0;
                if (sz6Var != null) {
                    sz6Var.b = new int[]{0, pq9Var.j(qv0Var).e().e.a.a};
                }
                pq9Var.j(qv0Var).getIcon();
                qv0Var.J0 = ColorStateList.valueOf(-1);
                qv0Var.K0 = ColorStateList.valueOf(pq9Var.j(qv0Var).getIcon().f);
                qv0Var.invalidate();
                break;
            case 3:
                od2.a0(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.Y;
                appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().i);
                break;
            case 4:
                od2.a0(obj);
                w12 w12Var = (w12) this.Y;
                w12Var.setBackgroundColor(pq9Var.j(w12Var).a().h().a.d);
                break;
            case 5:
                od2.a0(obj);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Y;
                coordinatorLayout.setBackgroundColor(pq9Var.j(coordinatorLayout).b().j);
                break;
            case 6:
                od2.a0(obj);
                int i = mw4.H0;
                ImageView imageView = (ImageView) ((mw4) this.Y).a;
                int i2 = pq9Var.j(imageView).d().a.a.h;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), null, shapeDrawable));
                break;
            case 7:
                od2.a0(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.Y;
                constraintLayout.setBackgroundColor(pq9Var.j(constraintLayout).b().j);
                break;
            case 8:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Y;
                endlessRecyclerView2.setBackgroundColor(pq9Var.j(endlessRecyclerView2).b().m);
                qp4.d(pq9Var.b(endlessRecyclerView2.getContext()), endlessRecyclerView2);
                endlessRecyclerView2.Y();
                break;
            case 9:
                od2.a0(obj);
                l91 l91Var = ((MainActivity) this.Y).W0;
                if (l91Var != null) {
                    l91Var.j();
                    break;
                }
                break;
            case 10:
                od2.a0(obj);
                csb csbVar = (csb) this.Y;
                csbVar.setBackgroundColor(pq9Var.j(csbVar).a().h().a.d);
                break;
            case 11:
                od2.a0(obj);
                ImageView imageView2 = (ImageView) this.Y;
                imageView2.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView2).getIcon().f));
                imageView2.setBackgroundColor(pq9Var.j(imageView2).b().a.g);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                od2.a0(obj);
                rta rtaVar = (rta) this.Y;
                rtaVar.a.unregisterActivityLifecycleCallbacks(rtaVar.c);
                break;
            case 13:
                od2.a0(obj);
                g6b g6bVar = (g6b) this.Y;
                int i3 = g6bVar.getCurrentTheme().d().a.a.d;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(g6bVar.getCurrentTheme().b().g);
                g6bVar.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), shapeDrawable2, null));
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                od2.a0(obj);
                f6b f6bVar = (f6b) this.Y;
                pq9Var.j(f6bVar).b();
                f6bVar.setBackground(new ColorDrawable(-1728053248));
                break;
            default:
                od2.a0(obj);
                ((x77) ((mec) this.Y).a).cancel(null);
                break;
        }
        return e5fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Y = obj;
    }
}
