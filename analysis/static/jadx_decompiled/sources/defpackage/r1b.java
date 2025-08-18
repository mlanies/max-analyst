package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes.dex */
public final class r1b extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1b(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                r1b r1bVar = new r1b(3, (Continuation) obj3, 0);
                r1bVar.Y = (gg1) obj;
                r1bVar.Z = (pqa) obj2;
                return r1bVar.o(e5f.a);
            case 1:
                r1b r1bVar2 = new r1b((g6b) this.Z, (Continuation) obj3, 1);
                r1bVar2.Y = (ImageView) obj;
                e5f e5fVar = e5f.a;
                r1bVar2.o(e5fVar);
                return e5fVar;
            case 2:
                r1b r1bVar3 = new r1b((g6b) this.Z, (Continuation) obj3, 2);
                r1bVar3.Y = (AppCompatTextView) obj;
                e5f e5fVar2 = e5f.a;
                r1bVar3.o(e5fVar2);
                return e5fVar2;
            case 3:
                r1b r1bVar4 = new r1b((Context) this.Z, (Continuation) obj3, 3);
                r1bVar4.Y = (h6b) obj;
                e5f e5fVar3 = e5f.a;
                r1bVar4.o(e5fVar3);
                return e5fVar3;
            case 4:
                r1b r1bVar5 = new r1b((u6c) this.Z, (Continuation) obj3, 4);
                r1bVar5.Y = (RecyclerView) obj;
                e5f e5fVar4 = e5f.a;
                r1bVar5.o(e5fVar4);
                return e5fVar4;
            case 5:
                r1b r1bVar6 = new r1b(3, (Continuation) obj3, 5);
                r1bVar6.Y = (z8c) obj;
                r1bVar6.Z = (fka) obj2;
                e5f e5fVar5 = e5f.a;
                r1bVar6.o(e5fVar5);
                return e5fVar5;
            case 6:
                r1b r1bVar7 = new r1b((RecordControlsWidget) this.Z, (Continuation) obj3, 6);
                r1bVar7.Y = (ImageView) obj;
                e5f e5fVar6 = e5f.a;
                r1bVar7.o(e5fVar6);
                return e5fVar6;
            case 7:
                r1b r1bVar8 = new r1b((RecordControlsWidget) this.Z, (Continuation) obj3, 7);
                r1bVar8.Y = (TextView) obj;
                e5f e5fVar7 = e5f.a;
                r1bVar8.o(e5fVar7);
                return e5fVar7;
            case 8:
                r1b r1bVar9 = new r1b((RecordControlsWidget) this.Z, (Continuation) obj3, 8);
                r1bVar9.Y = (fka) obj2;
                e5f e5fVar8 = e5f.a;
                r1bVar9.o(e5fVar8);
                return e5fVar8;
            case 9:
                r1b r1bVar10 = new r1b((View) this.Z, (Continuation) obj3, 9);
                r1bVar10.Y = (View) obj;
                e5f e5fVar9 = e5f.a;
                r1bVar10.o(e5fVar9);
                return e5fVar9;
            case 10:
                r1b r1bVar11 = new r1b((SearchMessageBottomWidget) this.Z, (Continuation) obj3, 10);
                r1bVar11.Y = (ConstraintLayout) obj;
                e5f e5fVar10 = e5f.a;
                r1bVar11.o(e5fVar10);
                return e5fVar10;
            case 11:
                r1b r1bVar12 = new r1b(3, (Continuation) obj3, 11);
                r1bVar12.Y = (List) obj;
                r1bVar12.Z = (b86) obj2;
                return r1bVar12.o(e5f.a);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                r1b r1bVar13 = new r1b(3, (Continuation) obj3, 12);
                r1bVar13.Y = (g4d) obj;
                r1bVar13.Z = (fka) obj2;
                e5f e5fVar11 = e5f.a;
                r1bVar13.o(e5fVar11);
                return e5fVar11;
            case 13:
                r1b r1bVar14 = new r1b((d4d) this.Z, (Continuation) obj3, 13);
                r1bVar14.Y = (ConstraintLayout) obj;
                e5f e5fVar12 = e5f.a;
                r1bVar14.o(e5fVar12);
                return e5fVar12;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                r1b r1bVar15 = new r1b((tmd) this.Z, (Continuation) obj3, 14);
                r1bVar15.Y = (fka) obj2;
                e5f e5fVar13 = e5f.a;
                r1bVar15.o(e5fVar13);
                return e5fVar13;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                r1b r1bVar16 = new r1b(3, (Continuation) obj3, 15);
                r1bVar16.Y = (AppCompatImageView) obj;
                r1bVar16.Z = (fka) obj2;
                e5f e5fVar14 = e5f.a;
                r1bVar16.o(e5fVar14);
                return e5fVar14;
            case 16:
                r1b r1bVar17 = new r1b((h4e) this.Y, (Context) this.Z, (Continuation) obj3);
                e5f e5fVar15 = e5f.a;
                r1bVar17.o(e5fVar15);
                return e5fVar15;
            case LangUtils.HASH_SEED /* 17 */:
                r1b r1bVar18 = new r1b((SuggestionsWidget) this.Z, (Continuation) obj3, 17);
                r1bVar18.Y = (fka) obj2;
                e5f e5fVar16 = e5f.a;
                r1bVar18.o(e5fVar16);
                return e5fVar16;
            case 18:
                r1b r1bVar19 = new r1b((View) this.Z, (Continuation) obj3, 18);
                r1bVar19.Y = (ImageView) obj;
                e5f e5fVar17 = e5f.a;
                r1bVar19.o(e5fVar17);
                return e5fVar17;
            case 19:
                r1b r1bVar20 = new r1b((UploadFileAttachWorker) this.Z, (Continuation) obj3, 19);
                r1bVar20.Y = (Throwable) obj2;
                e5f e5fVar18 = e5f.a;
                r1bVar20.o(e5fVar18);
                return e5fVar18;
            case 20:
                r1b r1bVar21 = new r1b((VideoMessageWidget) this.Z, (Continuation) obj3, 20);
                r1bVar21.Y = (TextView) obj;
                e5f e5fVar19 = e5f.a;
                r1bVar21.o(e5fVar19);
                return e5fVar19;
            default:
                r1b r1bVar22 = new r1b((lsf) this.Z, (Continuation) obj3, 21);
                r1bVar22.Y = (fka) obj2;
                e5f e5fVar20 = e5f.a;
                r1bVar22.o(e5fVar20);
                return e5fVar20;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        fqa fqaVar;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                gg1 gg1Var = (gg1) this.Y;
                pqa pqaVar = (pqa) this.Z;
                int size = pqaVar.c.size();
                Map map = pqaVar.c;
                fqa fqaVar2 = pqaVar.a;
                if (size > 1) {
                    if (gg1Var == null && (gg1Var = pqaVar.d) == null) {
                        gg1Var = pqaVar.e;
                    }
                    fqaVar = (fqa) map.get(gg1Var);
                    if (fqaVar == null) {
                    }
                } else {
                    fqaVar = (fqa) x53.h0(map.values());
                    if (fqaVar != null) {
                        if (!fqaVar.a.l() && fqaVar2.a.a()) {
                        }
                    }
                }
                break;
            case 1:
                od2.a0(obj);
                ImageView imageView = (ImageView) this.Y;
                g6b g6bVar = (g6b) this.Z;
                Integer num = g6bVar.b;
                imageView.setImageTintList(ColorStateList.valueOf(num != null ? g6bVar.getCurrentTheme().c(num.intValue()) : g6bVar.getCurrentTheme().getIcon().f));
                break;
            case 2:
                od2.a0(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.Y;
                g6b g6bVar2 = (g6b) this.Z;
                Integer num2 = g6bVar2.b;
                appCompatTextView.setTextColor(num2 != null ? g6bVar2.getCurrentTheme().c(num2.intValue()) : g6bVar2.getCurrentTheme().getText().e);
                break;
            case 3:
                od2.a0(obj);
                h6b h6bVar = (h6b) this.Y;
                h6bVar.setBackground(new ColorDrawable(h6bVar.getCurrentTheme().b().g));
                qp4.d(qp4.u0.b((Context) this.Z), h6bVar);
                break;
            case 4:
                od2.a0(obj);
                ((RecyclerView) this.Y).setBackground(hm9.c0(Integer.valueOf(qp4.u0.b(((u6c) this.Z).a).i().b().g), null, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                break;
            case 5:
                od2.a0(obj);
                ((z8c) this.Y).W1.setColor(((fka) this.Z).i().b.c);
                break;
            case 6:
                od2.a0(obj);
                ImageView imageView2 = (ImageView) this.Y;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.Z;
                Drawable drawable = (Drawable) recordControlsWidget.H0.getValue();
                pq9 pq9Var = qp4.u0;
                pq9Var.j(imageView2).getIcon();
                ngg.G(drawable, -1);
                ngg.G(recordControlsWidget.B0(), pq9Var.j(imageView2).a().s().a.b.b);
                break;
            case 7:
                od2.a0(obj);
                TextView textView = (TextView) this.Y;
                pq9 pq9Var2 = qp4.u0;
                textView.setTextColor(pq9Var2.j(textView).getText().g);
                bc7[] bc7VarArr = RecordControlsWidget.b1;
                ngg.G((InsetDrawable) ((RecordControlsWidget) this.Z).I0.getValue(), pq9Var2.j(textView).getIcon().j);
                break;
            case 8:
                od2.a0(obj);
                fka fkaVar = (fka) this.Y;
                bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                ((GradientDrawable) ((RecordControlsWidget) this.Z).L0.getValue()).setColor(fkaVar.getText().b);
                break;
            case 9:
                od2.a0(obj);
                View view = (View) this.Y;
                pq9 pq9Var3 = qp4.u0;
                ((View) this.Z).setBackgroundColor(pq9Var3.j(view).b().k);
                ((TextView) view.findViewById(kxb.oneme_settings_privacy_onboarding_content_title)).setTextColor(pq9Var3.j(view).getText().e);
                break;
            case 10:
                od2.a0(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.Y;
                bc7[] bc7VarArr3 = SearchMessageBottomWidget.s0;
                SearchMessageBottomWidget searchMessageBottomWidget = (SearchMessageBottomWidget) this.Z;
                constraintLayout.setBackgroundColor(searchMessageBottomWidget.s0().a.d);
                searchMessageBottomWidget.n0().setTextColor(searchMessageBottomWidget.s0().d.g);
                searchMessageBottomWidget.o0().setBackgroundColor(searchMessageBottomWidget.s0().b.c);
                searchMessageBottomWidget.r0(searchMessageBottomWidget.p0(), searchMessageBottomWidget.Y);
                searchMessageBottomWidget.r0(searchMessageBottomWidget.m0(), searchMessageBottomWidget.Z);
                break;
            case 11:
                od2.a0(obj);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                od2.a0(obj);
                ((g4d) this.Y).setBackgroundColor(((fka) this.Z).b().m);
                break;
            case 13:
                od2.a0(obj);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.Y;
                d4d d4dVar = (d4d) this.Z;
                ImageView imageView3 = d4dVar.F0;
                pq9 pq9Var4 = qp4.u0;
                imageView3.setColorFilter(pq9Var4.j(constraintLayout2).getIcon().k);
                d4dVar.G0.setTextColor(pq9Var4.j(constraintLayout2).getText().e);
                d4dVar.H0.setTextColor(pq9Var4.j(constraintLayout2).getText().g);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                od2.a0(obj);
                fka fkaVar2 = (fka) this.Y;
                tmd tmdVar = (tmd) this.Z;
                tmdVar.M0.setBackgroundColor(fkaVar2.b().j);
                tmdVar.G0.setTextColor(fkaVar2.getText().e);
                AppCompatEditText appCompatEditText = tmdVar.H0;
                appCompatEditText.setTextColor(fkaVar2.getText().e);
                appCompatEditText.setHintTextColor(fkaVar2.getText().i);
                tmdVar.I0.setTextColor(fkaVar2.getText().j);
                tmdVar.O0.setTextColor(fkaVar2.getText().g);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                od2.a0(obj);
                ((AppCompatImageView) this.Y).setImageTintList(ColorStateList.valueOf(((fka) this.Z).getIcon().j));
                break;
            case 16:
                od2.a0(obj);
                h4e h4eVar = (h4e) this.Y;
                ngg.G(h4eVar.F0, qp4.u0.b((Context) this.Z).i().b().a.g);
                e02 e02Var = h4eVar.L0;
                if (e02Var != null) {
                    if (h4eVar.G0 != null) {
                        h4eVar.G0 = h4eVar.G();
                    }
                    w3e w3eVar = e02Var.b;
                    h4eVar.E(w3eVar.Y);
                    h4eVar.F(w3eVar.Z);
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                od2.a0(obj);
                fka fkaVar3 = (fka) this.Y;
                bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.Z;
                suggestionsWidget.z0().setTextColor(fkaVar3.getText().h);
                suggestionsWidget.y0().setBackgroundColor(fkaVar3.getIcon().h);
                bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                bc7 bc7Var = bc7VarArr5[4];
                ((AppCompatImageView) suggestionsWidget.x0.getValue()).setImageTintList(ColorStateList.valueOf(fkaVar3.getIcon().f));
                bc7 bc7Var2 = bc7VarArr5[5];
                ((AppCompatTextView) suggestionsWidget.y0.getValue()).setTextColor(fkaVar3.getText().e);
                break;
            case 18:
                od2.a0(obj);
                ImageView imageView4 = (ImageView) this.Y;
                pq9 pq9Var5 = qp4.u0;
                View view2 = (View) this.Z;
                pq9Var5.j(view2).getIcon();
                imageView4.setColorFilter(-1);
                imageView4.setBackgroundColor(pq9Var5.j(view2).b().a.k);
                break;
            case 19:
                od2.a0(obj);
                Throwable th = (Throwable) this.Y;
                if (th != null) {
                    UploadFileAttachWorker uploadFileAttachWorker = (UploadFileAttachWorker) this.Z;
                    uploadFileAttachWorker.e(th);
                    uploadFileAttachWorker.C0 = fm7.a();
                }
                break;
            case 20:
                od2.a0(obj);
                TextView textView2 = (TextView) this.Y;
                pq9 pq9Var6 = qp4.u0;
                pq9Var6.j(textView2).getText();
                textView2.setTextColor(-1);
                ((GradientDrawable) textView2.getBackground()).setColor(pq9Var6.j(textView2).b().a.h);
                bc7[] bc7VarArr6 = VideoMessageWidget.y0;
                ngg.G((InsetDrawable) ((VideoMessageWidget) this.Z).s0.getValue(), pq9Var6.j(textView2).f().a);
                break;
            default:
                od2.a0(obj);
                fka fkaVar4 = (fka) this.Y;
                lsf lsfVar = (lsf) this.Z;
                Drawable pauseSmallIcon = lsfVar.getPauseSmallIcon();
                fkaVar4.getIcon();
                ngg.G(pauseSmallIcon, -1);
                ngg.G(lsfVar.getPlayIcon(), -1);
                break;
        }
        return e5f.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1b(h4e h4eVar, Context context, Continuation continuation) {
        super(3, continuation);
        this.X = 16;
        this.Y = h4eVar;
        this.Z = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1b(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
    }
}
