package defpackage;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public final class a87 extends AsyncTask {
    public final /* synthetic */ i87 a;

    public a87(i87 i87Var) {
        this.a = i87Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        while (true) {
            i87 i87Var = this.a;
            d87 d87VarDequeueWork = i87Var.dequeueWork();
            if (d87VarDequeueWork == null) {
                return null;
            }
            i87Var.onHandleWork(d87VarDequeueWork.getIntent());
            d87VarDequeueWork.a();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.a.processorFinished();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.processorFinished();
    }
}
