package defpackage;

import android.R;
import android.content.res.Resources;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class xz7 implements ActionMode.Callback {
    public final EditText a;
    public final y8 b;
    public final HashSet c = new HashSet();

    public xz7(EditText editText, y8 y8Var) {
        this.a = editText;
        this.b = y8Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        Editable text = editText.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            int itemId = menuItem.getItemId();
            if (itemId == zxb.markdown_bold) {
                kp.u(text, selectionStart, selectionEnd, false, new wp0(0));
                actionMode.finish();
                return true;
            }
            if (itemId == zxb.markdown_italic) {
                kp.u(text, selectionStart, selectionEnd, false, new wp0(1));
                actionMode.finish();
                return true;
            }
            if (itemId == zxb.markdown_underline) {
                kp.u(text, selectionStart, selectionEnd, true, new l9e(1));
                actionMode.finish();
                return true;
            }
            if (itemId == zxb.markdown_mono) {
                kp.u(text, selectionStart, selectionEnd, true, new gc9());
                actionMode.finish();
                return true;
            }
            if (itemId == zxb.markdown_strikethrough) {
                kp.u(text, selectionStart, selectionEnd, true, new l9e(0));
                actionMode.finish();
                return true;
            }
            if (itemId == zxb.markdown_code) {
                kp.u(text, selectionStart, selectionEnd, false, new t43());
                actionMode.finish();
                return true;
            }
            if (itemId == zxb.markdown_link) {
                y8 y8Var = this.b;
                if (y8Var != null) {
                    ek7[] ek7VarArr = (ek7[]) text.getSpans(selectionStart, selectionEnd, ek7.class);
                    if (ek7VarArr != null && ek7VarArr.length != 0) {
                        while (true) {
                            if (i >= ek7VarArr.length) {
                                bc7[] bc7VarArr = MessageWriteWidget.F0;
                                zz7 zz7Var = (zz7) ((MessageWriteWidget) y8Var.a).c.getValue();
                                zz7Var.getClass();
                                pnf.o(zz7Var.c, new w9(selectionStart, selectionEnd, null));
                                break;
                            }
                            int i2 = i + 1;
                            try {
                                ek7 ek7Var = ek7VarArr[i];
                                int spanStart = text.getSpanStart(ek7Var);
                                int spanEnd = text.getSpanEnd(ek7Var);
                                if (spanStart == selectionStart && spanEnd == selectionEnd) {
                                    String str = ek7Var.b;
                                    bc7[] bc7VarArr2 = MessageWriteWidget.F0;
                                    zz7 zz7Var2 = (zz7) ((MessageWriteWidget) y8Var.a).c.getValue();
                                    zz7Var2.getClass();
                                    pnf.o(zz7Var2.c, new w9(selectionStart, selectionEnd, str));
                                    break;
                                }
                                i = i2;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                    } else {
                        bc7[] bc7VarArr3 = MessageWriteWidget.F0;
                        zz7 zz7Var3 = (zz7) ((MessageWriteWidget) y8Var.a).c.getValue();
                        zz7Var3.getClass();
                        pnf.o(zz7Var3.c, new w9(selectionStart, selectionEnd, null));
                    }
                }
                return true;
            }
            if (itemId == zxb.markdown_heading) {
                kp.u(text, selectionStart, selectionEnd, true, new ej6());
                actionMode.finish();
                return true;
            }
            if (itemId == zxb.markdown_regular) {
                yz7[] yz7VarArr = (yz7[]) text.getSpans(selectionStart, selectionEnd, yz7.class);
                if (yz7VarArr.length != 0) {
                    int length = yz7VarArr.length;
                    while (i < length) {
                        kp.v(text, yz7VarArr[i], selectionStart, selectionEnd);
                        i++;
                    }
                }
                actionMode.finish();
                return true;
            }
            if (itemId != 16908320 && itemId != 16908321) {
                hm9.n("xz7", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(menuItem.getItemId())}, 1)));
            }
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) throws Resources.NotFoundException {
        HashSet hashSet = this.c;
        hashSet.clear();
        hashSet.add(Integer.valueOf(R.id.cut));
        hashSet.add(Integer.valueOf(R.id.copy));
        sz7.c.getClass();
        for (sz7 sz7Var : sz7.X) {
            int i = sz7Var.a;
            menu.add(zxb.markdown_group, i, 0, this.a.getResources().getString(sz7Var.b)).setShowAsAction(0);
            hashSet.add(Integer.valueOf(i));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.c.clear();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        pk5 pk5Var = new pk5(l6d.Z(new at(4, menu), new wz7(0, this)));
        while (pk5Var.hasNext()) {
            menu.removeItem(((MenuItem) pk5Var.next()).getItemId());
        }
        return true;
    }
}
