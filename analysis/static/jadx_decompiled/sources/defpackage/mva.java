package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mva implements Externalizable {
    public boolean Z;
    public boolean o;
    public String a = "";
    public String b = "";
    public final ArrayList c = new ArrayList();
    public String X = "";
    public boolean Y = false;
    public String s0 = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.o = true;
            this.X = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.Z = true;
            this.s0 = utf2;
        }
        this.Y = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.c.get(i));
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            objectOutput.writeUTF(this.X);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.s0);
        }
        objectOutput.writeBoolean(this.Y);
    }
}
