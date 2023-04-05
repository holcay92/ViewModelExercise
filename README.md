# ViewModelExercise
Udemy Course Exercises
Daily commits

Examples of followings:
--------------------------------
ViewModel:
In order to use the view model we have to provide the view model,
private lateinit var viewModel: MainActivityViewModel
viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

DataBinding:
private lateinit var binding: ActivityMainBinding
binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

ViewModelFactory:

LiveData: In order to use the live data with data binding
we have to provide the lifecycle owner to the data binding.
I.E :  binding.lifecycleOwner = this
for two way data binding :  android:text="@={viewModel.userName}" for the edittext and 
                            android:text="@{viewModel.userName}" for the textview
