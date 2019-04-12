package com.greg_games.teamseshmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBones extends ModelBase 
{
    public ModelRenderer BonesRightArm;
    public ModelRenderer BonesRightLeg;
    public ModelRenderer BonesHead;
    public ModelRenderer BonesBody;
    public ModelRenderer BonesLeftArm;
    public ModelRenderer BonesLeftLeg;
    public ModelRenderer BonesOuterHead;

    public ModelBones() 
    {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BonesOuterHead = new ModelRenderer(this, 32, 0);
        this.BonesOuterHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BonesOuterHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.BonesRightLeg = new ModelRenderer(this, 0, 16);
        this.BonesRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.BonesRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.BonesRightArm = new ModelRenderer(this, 40, 16);
        this.BonesRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BonesRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BonesRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.BonesLeftLeg = new ModelRenderer(this, 0, 16);
        this.BonesLeftLeg.mirror = true;
        this.BonesLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.BonesLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.BonesHead = new ModelRenderer(this, 0, 0);
        this.BonesHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BonesHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.BonesLeftArm = new ModelRenderer(this, 40, 16);
        this.BonesLeftArm.mirror = true;
        this.BonesLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BonesLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BonesLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.BonesBody = new ModelRenderer(this, 16, 16);
        this.BonesBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BonesBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.BonesOuterHead.render(f5);
        this.BonesRightLeg.render(f5);
        this.BonesRightArm.render(f5);
        this.BonesLeftLeg.render(f5);
        this.BonesHead.render(f5);
        this.BonesLeftArm.render(f5);
        this.BonesBody.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    	float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
        float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
        this.BonesRightArm.rotateAngleZ = 0.0F;
        this.BonesLeftArm.rotateAngleZ = 0.0F;
        this.BonesRightArm.rotateAngleY = -(0.1F - f * 0.6F);
        this.BonesLeftArm.rotateAngleY = 0.1F - f * 0.6F;
    	this.BonesLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F)  * 1.4F * limbSwingAmount;
    	this.BonesRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI)  * 1.4F * limbSwingAmount;
    }
}
