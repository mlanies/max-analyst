package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j27 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ int Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j27(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
        switch (i2) {
            case 1:
                this.Y = i;
                super(3, continuation);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                j27 j27Var = new j27(3, (Continuation) obj3, 0);
                j27Var.Z = (String) obj;
                j27Var.Y = iIntValue;
                return j27Var.o(e5f.a);
            default:
                j27 j27Var2 = new j27(this.Y, (Continuation) obj3, 1);
                j27Var2.Z = (ImageView) obj;
                e5f e5fVar = e5f.a;
                j27Var2.o(e5fVar);
                return e5fVar;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z = true;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                String str = (String) this.Z;
                int i = this.Y;
                if (str.length() != i && i != -1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                od2.a0(obj);
                ImageView imageView = (ImageView) this.Z;
                int i2 = woc.E;
                pq9 pq9Var = qp4.u0;
                bs6 icon = pq9Var.j(imageView).getIcon();
                Drawable drawableB = kt3.b(imageView.getContext(), i2);
                ngg.G(drawableB, icon.j);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                int i3 = this.Y;
                shapeDrawable.setIntrinsicWidth(i3);
                shapeDrawable.setIntrinsicHeight(i3);
                shapeDrawable.setTint(pq9Var.j(imageView).b().a.g);
                int iG = (i3 - tu0.G(16 * fk4.d().getDisplayMetrics().density)) / 2;
                int iG2 = (i3 - tu0.G(12 * fk4.d().getDisplayMetrics().density)) / 2;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableB});
                layerDrawable.setLayerInset(1, iG, iG2, iG, iG2);
                imageView.setImageDrawable(layerDrawable);
                return e5f.a;
        }
    }
}
