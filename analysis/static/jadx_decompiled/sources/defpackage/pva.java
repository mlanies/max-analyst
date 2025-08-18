package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pva implements Externalizable {
    public boolean X;
    public boolean a;
    public String b = "";
    public final ArrayList c = new ArrayList();
    public final ArrayList o = new ArrayList();
    public String Y = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.a = true;
            this.b = utf;
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.o.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.X = true;
            this.Y = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            objectOutput.writeUTF(this.b);
        }
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) this.c.get(i)).intValue());
        }
        ArrayList arrayList = this.o;
        int size2 = arrayList.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.X);
        if (this.X) {
            objectOutput.writeUTF(this.Y);
        }
    }
}
