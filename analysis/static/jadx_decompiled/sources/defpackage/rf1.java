package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class rf1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf1(s3e s3eVar, m6e m6eVar) {
        this.a = 4;
        this.c = s3eVar;
        this.b = m6eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m56 m56Var;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = CallOpponentsListWidget.H0;
                if (view instanceof EditText) {
                    EditText editText = (EditText) view;
                    if (motionEvent.getX() >= editText.getWidth() - editText.getTotalPaddingRight()) {
                        if (motionEvent.getAction() == 1) {
                            ((m56) obj).invoke((EditText) obj2);
                            break;
                        }
                    }
                }
                break;
            case 1:
                p85 p85Var = (p85) obj;
                SpannableString text = p85Var.getText();
                if (text != null) {
                    j33 j33Var = ((eq3) obj2).b;
                    Layout textLayout = p85Var.getTextLayout();
                    j33Var.getClass();
                    if (motionEvent.getAction() == 0) {
                        j33Var.d = new qz7(new WeakReference(view), 12, textLayout);
                        j33Var.e = text;
                    }
                    break;
                }
                break;
            case 2:
                bc7[] bc7VarArr2 = MessageWriteWidget.F0;
                ((m56) obj).invoke(motionEvent);
                break;
            case 3:
                if (motionEvent.getAction() == 1) {
                    Chip chip = (Chip) obj;
                    if (motionEvent.getX() <= chip.getChipStartPadding() + (chip.getChipIcon() != null ? r5.getIntrinsicWidth() : 0)) {
                        ((k56) obj2).invoke();
                        break;
                    }
                }
                break;
            default:
                s3e s3eVar = (s3e) obj2;
                y0d y0dVar = s3eVar.J0;
                w0d w0dVar = y0dVar instanceof w0d ? (w0d) y0dVar : null;
                if (motionEvent.getAction() == 0 && w0dVar != null && w0dVar.Y && (m56Var = (m56) obj) != null) {
                    m56Var.invoke(s3eVar);
                    break;
                }
                break;
        }
        return false;
    }

    public /* synthetic */ rf1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
