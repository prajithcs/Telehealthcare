package com.iorbit.telehealthcare.onboarding;

import com.iorbit.telehealthcare.util.data.IllnessDescription;
import com.iorbit.telehealthcare.util.data.MedicalCondition;

public class EditSubscriber {

	private int id;
	private String type;
	private String carehomeName;
	private MedicalCondition medicalCondition = new MedicalCondition();
	private IllnessDescription illnessDescription = new IllnessDescription();
	private String caretakerName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCarehomeName() {
		return carehomeName;
	}

	public void setCarehomeName(String carehomeName) {
		this.carehomeName = carehomeName;
	}

	public MedicalCondition getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(MedicalCondition medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public IllnessDescription getIllnessDescription() {
		return illnessDescription;
	}

	public void setIllnessDescription(IllnessDescription illnessDescription) {
		this.illnessDescription = illnessDescription;
	}

	public String getCaretakerName() {
		return caretakerName;
	}

	public void setCaretakerName(String caretakerName) {
		this.caretakerName = caretakerName;
	}

}
