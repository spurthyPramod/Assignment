import {
	Component
} from '@angular/core';
import {
	FormBuilder,
	FormGroup,
	FormArray
} from '@angular/forms';
import {
	HttpClient,
	HttpHeaders
} from '@angular/common/http';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {

	/***

	JSOON Response data to post the questions and subquestions to backend
	*/
	data = {
		questions: [{
			question: "",
			choice: "",
			parentTextArea: "",
			parentSingleChoice: "",
			multitext1: "",
			multitext2: "",
			multitext3: "",
			multitext4: "",
			multitext5: "",
			subquestions: [{
				subquestion: "",
			}]
		}]
	}

	/***Variable to display question only when on click of Add Question and Add subQuestion button*/

	public question = false;
	public subquestion = false;
	regTypeSelectedOption: string = "";
	selectedNav: any;
	regTypeSubSelectedOption: string = "";
	subselectedNav: any;
	myForm: FormGroup;

	constructor(private fb: FormBuilder, private http: HttpClient) {
		this.myForm = this.fb.group({

			questions: this.fb.array([])
		})

		this.setQuestions();
	}
	/*** Onsubmit of Form calling backend service to insert the data into the database**/
	onSubmit() {
		console.log(this.myForm.value);
		this.object = this.myForm.value;

		var body = this.myForm.value;
		this.http.post("http://localhost:8080/user-portal/questions", body).subscribe((data) => {});
	}


	/** Onclick Of Add new question pushing the values to the question array**/


	addNewQuestion() {
		let control = < FormArray > this.myForm.controls.questions;
		if (this.question == true) {
			control.push(
				this.fb.group({
					question: [''],
					choice: [''],
					parentTextArea: [''],
					parentSingleChoice: [''],
					multitext1: [''],
					multitext2: [''],
					multitext3: [''],
					multitext4: [''],
					multitext5: [''],
					subquestions: this.fb.array([])
				})
			)
		}
		this.question = true;
	}

	/** Onclick Of Add new sub question pushing the values to the sub question array**/


	addNewSubQuestion(control) {
		if (this.subquestion == true) {
			control.push(
				this.fb.group({
					subchoice: [''],
					subquestion_name: [''],
					childTextArea: [''],
					childSingleChoice: [''],
					childmultitext1: [''],
					childmultitext2: [''],
					childmultitext3: [''],
					childmultitext4: [''],
					childmultitext5: ['']
				}))
		}
		this.subquestion = true;
	}


	setQuestions() {
		let control = < FormArray > this.myForm.controls.questions;
		this.data.questions.forEach(x => {
			control.push(this.fb.group({
				question: x.question,
				choice: x.choice,
				parentTextArea: x.parentTextArea,
				parentSingleChoice: x.parentSingleChoice,
				multitext1: x.multitext1,
				multitext2: x.multitext2,
				multitext3: x.multitext3,
				multitext4: x.multitext4,
				multitext5: x.multitext5,
				subquestions: this.setSubQuestions(x)
			}))
		})
	}

	setSubQuestions(x) {
		let arr = new FormArray([])
		if (this.subquestion == true) {
			x.subquestions.forEach(y => {
				arr.push(this.fb.group({
					subquestion_name: y.subquestion_name,
					subchoice: y.subchoice,
					childTextArea: y.childTextArea,
					childSingleChoice: y.childSingleChoice,
					childmultitext1: y.childmultitext1,
					childmultitext2: y.childmultitext2,
					childmultitext3: y.childmultitext3,
					childmultitext4: y.childmultitext4,
					childmultitext5: y.childmultitext5


				}))
			})
		}
		this.subquestion = true;
		return arr;
	}


	/*** On change of combo box **/
	setChoice(nav: any) {
		this.selectedNav = nav;
		if (this.selectedNav == "multiline") {
			this.regTypeSelectedOption = "multiline";
		} else if (this.selectedNav == "singlechoice") {
			this.regTypeSelectedOption = "singlechoice";
		} else if (this.selectedNav == "multitext") {
			this.regTypeSelectedOption = "multitext";
		}
	}

	/***Method can be removed ***/

	setSubChoice(nav: any) {
		this.subselectedNav = nav;
		if (this.subselectedNav == "multiline") {
			this.regTypeSubSelectedOption = "multiline";
		} else if (this.subselectedNav == "singlechoice") {
			this.regTypeSubSelectedOption = "singlechoice";
		} else if (this.subselectedNav == "multitext") {
			this.regTypeSubSelectedOption = "multitext";
		}
	}

}